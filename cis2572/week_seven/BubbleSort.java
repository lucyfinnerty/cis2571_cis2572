/*
 * Author: Lucy Finnerty
 * This program demonstrates the bubble sort algorithm by animating the sorting process.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class BubbleSort extends Application{
    private static final int SIZE = 20; // number of bars to sort
    private int[] array = new int[SIZE]; // array to sort
    private int i = 0, j = 0; // indices for sorting
    private boolean sorted = false; // indicate when sorting is complete

    private Canvas canvas = new Canvas(400, 300); // canvas to draw histogram
    private GraphicsContext gc = canvas.getGraphicsContext2D(); // graphics context for drawing

    @Override
    public void start(Stage primaryStage) {
        generateRandomArray(); // generate random array to sort
        drawHistogram(); // draw histogram of array

        Button stepButton = new Button("Step"); // button to step through sorting
        Button resetButton = new Button("Reset"); // button to reset sorting

        stepButton.setOnAction(e -> { // step through sorting
            if (!sorted) { // if sorting is not complete
                stepBubbleSort(); // step through bubble sort
                drawHistogram(); // draw histogram of array
            }
        });

        resetButton.setOnAction(e -> { // reset sorting
            generateRandomArray(); // generate new random array
            i = 0; // reset indices
            j = 0;
            sorted = false; // indicate sorting is not complete
            drawHistogram(); // draw histogram of array
        });

        HBox controls = new HBox(10, stepButton, resetButton); // controls for sorting
        BorderPane root = new BorderPane(); // root pane for layout
        root.setCenter(canvas); // center canvas
        root.setBottom(controls); // bottom controls

        primaryStage.setScene(new Scene(root, 450, 350)); // create scene
        primaryStage.setTitle("Bubble Sort Animation"); // set title
        primaryStage.show(); // display stage
    }
    /**
     * generates an array of random integers from 1 to SIZE
     */
    private void generateRandomArray() {
        boolean[] used = new boolean[SIZE + 1]; // array to keep track of used numbers
        Random rand = new Random(); // random number generator
        for (int k = 0; k < SIZE; k++) { // generate random numbers
            int num; // random number
            do {
                num = rand.nextInt(SIZE) + 1; // generate random number from 1 to SIZE
            } while (used[num]); // repeat if number is already used
            used[num] = true; // mark number as used
            array[k] = num; // store number in array
        }
    }
    /**
     * steps through bubble sort algorithm
     */
    private void stepBubbleSort() {
        if (i < SIZE - 1) { // if not at end of array
            if (j < SIZE - i - 1) { // if not at end of unsorted portion
                if (array[j] > array[j + 1]) { // if out of order
                    int temp = array[j]; // temp set to current element
                    array[j] = array[j + 1]; // current element set to next element
                    array[j + 1] = temp; // next element set to temp
                }
                j++; // move to next element
            } else {
                j = 0; // reset j
                i++; // move to next element
            }
        } else {
            sorted = true; // indicate sorting is complete
        }
    }
    /**
     * draws histogram of array
     */
    private void drawHistogram() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // clear canvas
        double barWidth = canvas.getWidth() / SIZE; // width of each bar
        for (int k = 0; k < SIZE; k++) { // draw each bar
            if (!sorted && k == j) { // highlight current comparison
                gc.setFill(Color.RED); // highlight comparison in red
            } else {
                gc.setFill(Color.BLACK); // set bar color to black
            }
            double barHeight = (array[k] / 20.0) * (canvas.getHeight() - 20); // height of bar
            gc.fillRect(k * barWidth + 2, canvas.getHeight() - barHeight, barWidth - 4, barHeight); // draw bar
            gc.strokeText(String.valueOf(array[k]), k * barWidth + 5, canvas.getHeight() - barHeight - 5); // draw number
        }
        if (sorted) { // if sorting is complete
            gc.setFill(Color.BLUE); // set color to blue
            gc.fillText("Sorting Complete!", canvas.getWidth() / 2 - 50, 20); // display message
        }
    }
    public static void main(String[] args) {
        launch(args); // launch application
    }
}