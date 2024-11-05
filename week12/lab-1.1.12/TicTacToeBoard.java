// Name: Lucy Finnerty
// Date: 11/5/24
// Purpose:
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class TicTacToeBoard extends Application {
    private static final int SIZE = 3; // tic-tac-toe board size
    public static void main(String[] args) {
        // creates stage and calls the start method
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        Image xImage = new Image("x.gif");
        Image oImage = new Image("o.gif");
        Random random = new Random();

        for(int row=0; row < SIZE; row++) {
            for(int col=0; col < SIZE; col++) {
                int value = random.nextInt(3);
                if(value == 0) {
                    grid.add(new ImageView(xImage), col, row);
                } else if(value == 1) {
                    grid.add(new ImageView(oImage), col, row);
                } // else cell is empty
            }
        }
        Scene scene = new Scene(grid, 150, 150); // create new scene
        primaryStage.setScene(scene); // set scene on stage
        primaryStage.setTitle("TicTacToe"); // give gui window a name
        primaryStage.show(); // display
    }
}