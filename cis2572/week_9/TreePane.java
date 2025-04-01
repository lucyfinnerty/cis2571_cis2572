import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class TreePane extends Pane {
    private BST<Integer> tree;

    public TreePane(BST<Integer> tree) {
        this.tree = tree;
        update();
    }

    public void update() {
        this.getChildren().clear();
        if (tree.getRoot() != null) {
            displayTree(tree.getRoot(), getWidth() / 2, 50, getWidth() / 4);
        }
    }

    private void displayTree(BST.TreeNode<Integer> root, double x, double y, double hGap) {
        if (root.left != null) {
            getChildren().add(new Line(x - hGap, y + 50, x, y));
            displayTree(root.left, x - hGap, y + 50, hGap / 2);
        }

        if (root.right != null) {
            getChildren().add(new Line(x + hGap, y + 50, x, y));
            displayTree(root.right, x + hGap, y + 50, hGap / 2);
        }

        Circle circle = new Circle(x, y, 15);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().addAll(circle, new Text(x - 5, y + 5, root.element.toString()));
    }
}