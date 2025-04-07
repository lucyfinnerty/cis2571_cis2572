/*
 * Author: Lucy Finnerty
 * This program demonstrates a BST data structure using buttons to insert, delete, and search elements in the tree.
 */
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Application;

public class BSTAnimation extends Application {
    private BST<Integer> tree = new BST<>();
    private TreePane treePane = new TreePane(tree);
    private Label label = new Label();

    @Override
    public void start(Stage primaryStage) {
        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(treePane);

        HBox controlPane = new HBox(10);
        controlPane.setAlignment(Pos.CENTER);

        TextField textFieldKey = new TextField();
        textFieldKey.setPrefColumnCount(3);
        Button insertButton = new Button("Insert");
        Button deleteButton = new Button("Delete");
        Button searchButton = new Button("Search");

        controlPane.getChildren().addAll(new Text("Enter a key:"), textFieldKey, insertButton, deleteButton, searchButton, label);
        mainPane.setBottom(controlPane);

        insertButton.setOnAction(e -> {
            try {
                int key = Integer.parseInt(textFieldKey.getText());
                if(tree.search(key)) { return; }
                tree.insert(key);
                treePane.update();
            } catch (NumberFormatException ex) {
                System.out.println("invalid input");
            }
        });
        deleteButton.setOnAction(e -> {
            try {
                int key = Integer.parseInt(textFieldKey.getText());
                if(!tree.search(key)) { return; }
                tree.delete(key);
                treePane.update();
            } catch (NumberFormatException ex) {
                System.out.println("invalid input");
            }
        });
        searchButton.setOnAction(e -> {
            try {
                int key = Integer.parseInt(textFieldKey.getText());
                if(tree.search(key)) { 
                    label.setText("Key found: " + key);
                } else {
                    label.setText("Key not found: " + key);
                }
            } catch (NumberFormatException ex) {
                label.setText("invalid input");
            }
        });
        Scene scene = new Scene(mainPane, 500, 400);
        primaryStage.setTitle("BST Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args); // launch application
    }
}