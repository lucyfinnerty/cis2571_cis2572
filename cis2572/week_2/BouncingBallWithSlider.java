/*
 * Author: Lucy Finnerty
 * This program contains a bouncing ball animation with a slider to adjust the speed of the ball from 1 to 10.
 */
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBallWithSlider extends Application {
    private double dx = 2, dy = 2; // Ball movement speed in X and Y directions
    private Timeline animation; // timeline for moving the ball animation

    @Override
    public void start(Stage primaryStage) {
        Pane ballPane = new Pane(); // pane to hold the ball allowing free movement
        Circle ball = new Circle(20, Color.GREEN); // a ball with radius 20 and color green
        ball.setCenterX(100); // initial X position of the ball
        ball.setCenterY(100); // initial Y position of the ball
        ballPane.getChildren().add(ball); // add ball to pane

        // create slider to adjust speed
        Slider speedSlider = new Slider(1, 10, 5); // Min, Max, Default speed
        speedSlider.setShowTickLabels(true); // show tick labels
        speedSlider.setShowTickMarks(true); // show tick marks

        // create a border pane layout to hold the ball and slider
        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane); // center the ball
        pane.setBottom(speedSlider); // place slider at the bottom

        // create an animation timeline that updates every 20 milliseconds
        animation = new Timeline(new KeyFrame(Duration.millis(20), e -> moveBall(ball, ballPane)));
        animation.setCycleCount(Timeline.INDEFINITE); // run animation indefinitely
        animation.play(); // start animation

        // adjust speed based on slider value
        speedSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            double speedFactor = newVal.doubleValue(); // get the new speed value
            dx = Math.signum(dx) * speedFactor; // adjust speed in X direction
            dy = Math.signum(dy) * speedFactor; // adjust speed in Y direction
        });
        // create a scene and display the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Bouncing Ball with Speed Slider");
        primaryStage.setScene(scene);
        primaryStage.show(); // display window
    }

    /**
     * Moves the ball and handles bouncing off walls.
     */
    private void moveBall(Circle ball, Pane pane) {
        double x = ball.getCenterX(); // get the current X position of the ball
        double y = ball.getCenterY(); // get the current Y position of the ball
        double radius = ball.getRadius(); // get the radius of the ball

        if (x + dx > 400 - radius || x + dx < radius) dx *= -1; // bounce left/right walls
        if (y + dy > 300 - radius || y + dy < radius) dy *= -1; // bounce top/bottom walls

        ball.setCenterX(x + dx); // update ball positions
        ball.setCenterY(y + dy);
    }

    public static void main(String[] args) {
        launch(args); // launch application
    }
}