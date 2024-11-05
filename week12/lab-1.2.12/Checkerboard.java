// Name: Lucy Finnerty
// Date: 11/5/24
// Purpose:
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Checkerboard extends Application {
    private static final int CELL_SIZE = 50;
    private static final int BOARD_SIZE = 8;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();

        for(int row=0; row < BOARD_SIZE; row++) {
            for(int col=0; col < BOARD_SIZE; col++) {
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
