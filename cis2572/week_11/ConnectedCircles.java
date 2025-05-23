import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ConnectedCircles extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new CirclePane(), 450, 350);
        primaryStage.setTitle("Connected Circles"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /** Pane for displaying circles */
    class CirclePane extends Pane {
        private Circle selectedCircle = null; // Circle being dragged

        public CirclePane() {
            // Set the background color of the pane
            this.setOnMouseClicked(e -> {
                if (!isInsideACircle(new Point2D(e.getX(), e.getY()))) {
                    getChildren().add(new Circle(e.getX(), e.getY(), 20));
                    colorIfConnected();
                }
            });
            // Set the mouse event handlers for selecting circles
            this.setOnMousePressed(e -> {
                for (Node node : getChildren()) {
                    if (node.contains(new Point2D(e.getX(), e.getY()))) {
                        selectedCircle = (Circle) node;
                        break;
                    }
                }
            });
            // Set the mouse event handlers for dragging circles
            this.setOnMouseDragged(e -> {
                if (selectedCircle != null) {
                    selectedCircle.setCenterX(e.getX());
                    selectedCircle.setCenterY(e.getY());
                    colorIfConnected();
                }
            });
            // Set the mouse event handlers for releasing circles
            this.setOnMouseReleased(e -> {
                selectedCircle = null;
            });
        }
        // Check if the mouse click is inside a circle
        private boolean isInsideACircle(Point2D p) {
            for (Node circle : this.getChildren()) {
                if (circle.contains(p)) {
                    return true;
                }
            }
            return false;
        }
        // Check if the circles are connected and color them accordingly
        // If all circles are connected, color them red; otherwise, color them white
        private void colorIfConnected() {
            if (getChildren().size() == 0) return;

            java.util.List<Edge> edges = new java.util.ArrayList<>();
            for (int i = 0; i < getChildren().size(); i++) {
                for (int j = i + 1; j < getChildren().size(); j++) {
                    if (overlaps((Circle) getChildren().get(i),
                                (Circle) getChildren().get(j))) {
                        edges.add(new Edge(i, j));
                        edges.add(new Edge(j, i));
                    }
                }
            }
            // Create a graph and perform DFS to check connectivity
            Graph<Node> graph = new UnweightedGraph<>((java.util.List<Node>) getChildren(), edges);
            UnweightedGraph<Node>.SearchTree tree = graph.dfs(0);
            boolean allConnected = getChildren().size() == tree.getNumberOfVerticesFound();

            // Color the circles based on connectivity
            for (Node node : getChildren()) {
                Circle c = (Circle) node;
                if (allConnected) {
                    c.setFill(Color.RED);
                    c.setStroke(null);
                } else {
                    c.setFill(Color.WHITE);
                    c.setStroke(Color.BLACK);
                }
            }
        }
    }
    // Check if two circles overlap
    public static boolean overlaps(Circle c1, Circle c2) {
        return new Point2D(c1.getCenterX(), c1.getCenterY())
            .distance(c2.getCenterX(), c2.getCenterY())
            <= c1.getRadius() + c2.getRadius();
    }

    public static void main(String[] args) {
        launch(args);
    }
}