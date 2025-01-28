// Name: Lucy Finnerty
// Date: 11/5/24
// Purpose: This program displays a Tic-Tac-Toe board where each cell is randomly decided to be either X, O, or empty.
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
        // calls the start method
        launch(args);
    }
    /**
     * Called and ran from the main method to start the program.
     * Creates Tic-Tac-Toe grid and fills each cell with an X, O,
     * or empty space based on a randomized value.
     * 
     * @param primaryStage the top level container (the window)
     */
    @Override
    public void start(Stage primaryStage) {
        // create new grid object for board
        GridPane grid = new GridPane();
        // load 2 new image objects set to x and o gifs
        Image xImage = new Image("x.gif");
        Image oImage = new Image("o.gif");
        Random random = new Random(); // new random object
        
        // nested loops to fill 3x3 grid
        for(int row=0; row < SIZE; row++) {
            for(int col=0; col < SIZE; col++) {
                // value set to 0, 1, or 2
                int value = random.nextInt(3);
                if(value == 0) { // if value is 0 -> load X gif
                    grid.add(new ImageView(xImage), col, row);
                } else if(value == 1) { // if value is 1 -> load O gif
                    grid.add(new ImageView(oImage), col, row);
                } // else (value is 2) cell is empty
            }
        }
        Scene scene = new Scene(grid, 150, 150); // create new scene
        primaryStage.setScene(scene); // set scene on stage
        primaryStage.setTitle("TicTacToe"); // give gui window a name
        primaryStage.show(); // display
    }
}