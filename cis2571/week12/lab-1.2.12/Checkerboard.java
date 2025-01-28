// Name: Lucy Finnerty
// Date: 11/5/24
// Purpose: This program displays an 8x8 Checkerboard, which has 64 cells alternating the color black and white.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {
    
    private static final int CELL_SIZE = 50; // size of each cell
    private static final int BOARD_SIZE = 8; // size of board
    
    public static void main(String[] args) {
        // calls the start method
        launch(args);
    }
    /**
     * Called and ran from the main method to start the program.
     * Creates the board (grid) and has 64 rectangle objects within
     * that alternates between the color black and white.
     * 
     * @param primaryStage the top level container (the window)
     */
    @Override
    public void start(Stage primaryStage) {
        // new grid object for the board
        GridPane grid = new GridPane();

        // nested for loops to fill the 8x8 grid
        for(int row=0; row < BOARD_SIZE; row++) {
            for(int col=0; col < BOARD_SIZE; col++) {
                // each cell is a rectangle object set to CELL_SIZE
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
                // alternate colors based on the row and column
                if ((row + col) % 2 == 0) {
                    cell.setFill(Color.WHITE);
                } else {
                    cell.setFill(Color.BLACK);
                }
                // add rectangle to the grid
                grid.add(cell, col, row);
            }
        }
        Scene scene = new Scene(grid, CELL_SIZE * BOARD_SIZE, CELL_SIZE * BOARD_SIZE); // create new scene
        primaryStage.setScene(scene); // set scene on stage
        primaryStage.setTitle("Checkerboard");  // give gui window a name
        primaryStage.show(); // display
    }
}