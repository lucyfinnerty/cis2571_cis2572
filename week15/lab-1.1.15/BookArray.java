import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class BookArray extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create an array of books
        Book[] books = new Book[10];
        books[0] = new Fiction("Harry Potter");
        books[1] = new NonFiction("Sapiens");
        books[2] = new Fiction("The Hobbit");
        books[3] = new NonFiction("Educated");
        books[4] = new Fiction("1984");
        books[5] = new NonFiction("The Immortal Life of Henrietta Lacks");
        books[6] = new Fiction("The Great Gatsby");
        books[7] = new NonFiction("Unbroken");
        books[8] = new Fiction("To Kill a Mockingbird");
        books[9] = new NonFiction("The Wright Brothers");

        // create a ListView to display book details
        ListView<String> bookListView = new ListView<>();

        // add book details to the ListView
        for (Book book : books) {
            bookListView.getItems().add("Title: " + book.getTitle() + ", Price: $" + book.getPrice());
        }

        // create a VBox layout and add the ListView
        VBox layout = new VBox(bookListView);

        // set up the scene
        Scene scene = new Scene(layout, 400, 300);

        // configure the primary stage
        primaryStage.setTitle("Book Details");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}