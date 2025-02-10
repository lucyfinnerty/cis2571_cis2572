/*
 * Author: Lucy Finnerty
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
    private double dx = 2, dy = 2; // Ball movement speed
    private Timeline animation;

    @Override
    public void start(Stage primaryStage) {
        Pane ballPane = new Pane();
        Circle ball = new Circle(20, Color.GREEN);
        ball.setCenterX(100);
        ball.setCenterY(100);
        ballPane.getChildren().add(ball);

        Slider speedSlider = new Slider(1, 10, 5); // Min, Max, Default speed
        speedSlider.setShowTickLabels(true);
        speedSlider.setShowTickMarks(true);

        BorderPane pane = new BorderPane();
        pane.setCenter(ballPane);
        pane.setBottom(speedSlider);

        animation = new Timeline(new KeyFrame(Duration.millis(20), e -> moveBall(ball, ballPane)));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

        // Adjust speed based on slider value
        speedSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            double speedFactor = newVal.doubleValue();
            dx = dx * speedFactor; // Keep direction but update speed
            dy = dy * speedFactor;
        });

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Bouncing Ball with Speed Slider");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveBall(Circle ball, Pane pane) {
        double x = ball.getCenterX();
        double y = ball.getCenterY();
        double radius = ball.getRadius();

        // Bounce off walls
        if (x + dx > 400 - radius || x + dx < radius) dx *= -1;
        if (y + dy > 300 - radius || y + dy < radius) dy *= -1;

        ball.setCenterX(x + dx);
        ball.setCenterY(y + dy);
    }

    public static void main(String[] args) {
        launch(args);
    }
}