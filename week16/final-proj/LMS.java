import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class LMS extends Application {
    private static BookManager bookManager;
    private static ListView<String> bookListView;
    private static ObservableList<String> listModel;

    public static void main(String[] args) {
        // initialize BookManager instance
        bookManager = new BookManager();
        launch(args); // launch application
    }

    @Override
    public void start(Stage primaryStage) {
        // set up the main window
        primaryStage.setTitle("Library Management System");

        // create the layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // center the grid
        grid.setVgap(10); // vertical gap between components
        grid.setHgap(10); // horizontal gap between components
        grid.setPadding(new Insets(20)); // padding around the grid

        // create the ListView to display books
        listModel = FXCollections.observableArrayList();
        bookListView = new ListView<>(listModel);
        grid.add(bookListView, 0, 0, 2, 1);

        // populate the List View with data from BookManager
        updateListView();
        
        // input fields
        Label titleLabel = new Label("Title:");
        TextField titleField = new TextField();
        grid.add(titleLabel, 0, 1);
        grid.add(titleField, 1, 1);

        Label firstNameLabel = new Label("Author First Name:");
        TextField firstNameField = new TextField();
        grid.add(firstNameLabel, 0, 2);
        grid.add(firstNameField, 1, 2);

        Label lastNameLabel = new Label("Author Last Name:");
        TextField lastNameField = new TextField();
        grid.add(lastNameLabel, 0, 3);
        grid.add(lastNameField, 1, 3);

        Label isbnLabel = new Label("ISBN:");
        TextField isbnField = new TextField();
        grid.add(isbnLabel, 0, 4);
        grid.add(isbnField, 1, 4);

        // the "ADD" button
        Button addButton = new Button("ADD");
        grid.add(addButton, 1, 5);

        // action for the Add button
        addButton.setOnAction(e -> {
            String title = titleField.getText().trim();
            String firstName = firstNameField.getText().trim();
            String lastName = lastNameField.getText().trim();
            String isbnText = isbnField.getText().trim();

            // check if all fields are filled in
            if (title.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || isbnText.isEmpty()) {
                showAlert(AlertType.WARNING, "All fields must be filled in.");
                return;
            }
            // create new Book instance and try to add it
            BookFP newBook = new BookFP(title, firstName, lastName, isbnText);
            boolean added = bookManager.add(newBook);

            if (added) { // save and update list view if the book is successfully added
                bookManager.save();
                updateListView();
            } else { // show message if the book is a duplicate
                showAlert(AlertType.ERROR, "This book is a duplicate.");
            }
        });
        // set up the scene
        Scene scene = new Scene(grid, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /*
     * helper method to update the list view with the latest book data
     */
    private static void updateListView() {
        listModel.clear();
        String[] report = bookManager.getReportList();
        listModel.addAll(report);
    }
    /*
     * method to show alert dialog
     */
    private void showAlert(AlertType alertType, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}