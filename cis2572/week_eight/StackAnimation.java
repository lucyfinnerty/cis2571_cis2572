/*
 * Author: Lucy Finnerty
 * This program demonstrates a stack data structure using buttons to push and pop rectangles
 */
import java.util.Stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackAnimation extends Application{
    private static final int RECT_WIDTH = 100; // width of the rectangles
    private static final int RECT_HEIGHT = 50; // height of the rectangles
    private static final int STACK_Y = 300; // starting Y position of the stack
    private static final int STACK_X = 150; // starting X position of the stack

    Pane pane = new Pane(); // pane to hold the rectangles
    Stack<Rectangle> stack = new Stack<>(); // stack to hold the rectangles
    private int topY = STACK_Y; // current Y position of the top rectangle

    @Override
    public void start(Stage primaryStage) {
        Button pushButton = new Button("Push"); // button to push a rectangle onto the stack
        Button popButton = new Button("Pop"); // button to pop a rectangle from the stack

        // set the positions of the buttons
        pushButton.setLayoutX(50);
        pushButton.setLayoutY(300);
        pushButton.setOnAction(e -> push());

        popButton.setLayoutX(300);
        popButton.setLayoutY(300);
        popButton.setOnAction(e -> pop());

        pane.getChildren().addAll(pushButton, popButton); // add buttons to the pane

        // create a scene with the pane and set the size
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stack Animation");
        primaryStage.show();
    }
    /**
     * pushes a rectangle onto the stack (adds a rectangle to the pane)
     */
    private void push() {
        if(stack.size() < 7) { // limit the stack to 7 rectangles
            Rectangle rect = new Rectangle(STACK_X, topY, RECT_WIDTH, RECT_HEIGHT); // create a new rectangle
            rect.setFill(Color.RED); // set color of the rectangle to red
            rect.setStroke(Color.BLACK); // set border color of the rectangle to black
            rect.setStrokeWidth(2); // set border width of the rectangle
            stack.push(rect); // push the rectangle onto the stack
            pane.getChildren().add(rect); // add the rectangle to the pane
            topY -= RECT_HEIGHT; // move the top Y position down for the next rectangle
        }
    }
    /*
     * pops a rectangle from the stack (removes a rectangle from the pane)
     */
    private void pop() {
        if (!stack.isEmpty()) { // check if the stack is not empty
            Rectangle rect = stack.pop(); // pop the rectangle from the stack
            pane.getChildren().remove(rect); // remove the rectangle from the pane
            topY += RECT_HEIGHT; // move the top Y position up for the next rectangle
        }
    }
    public static void main(String[] args) {
        launch(args); // launch application
    }
}