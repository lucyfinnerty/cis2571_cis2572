import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 * TreePane is a custom pane that displays a binary search tree (BST).
 * It extends the Pane class and provides a method to visualize the tree structure.
 */
public class TreePane extends Pane {
    private BST<Integer> tree; // The binary search tree to be displayed

    /**
    * Constructor that initializes the TreePane with a given BST.
     * @param tree
     */
    public TreePane(BST<Integer> tree) {
        this.tree = tree;
        update();
    }
    /*
     * Updates the TreePane by clearing the current display and redrawing the tree.
     */
    public void update() {
        this.getChildren().clear(); // clear the current display
        if (tree.getRoot() != null) { // check if the tree is not empty
            displayTree(tree.getRoot(), getWidth() / 2, 50, getWidth() / 4); // start displaying the tree from the root
        }
    }
    /*
     * Displays the binary search tree starting from the given root node.
     * @param root The root node of the tree to be displayed.
     * @param x The x-coordinate for the current node.
     * @param y The y-coordinate for the current node.
     * @param hGap The horizontal gap between nodes.
     */
    private void displayTree(BST.TreeNode<Integer> root, double x, double y, double hGap) {
        if (root.left != null) { // check if the left child exists
            // draw a line from the current node to the left child
            getChildren().add(new Line(x - hGap, y + 50, x, y));
            displayTree(root.left, x - hGap, y + 50, hGap / 2);
        }
        if (root.right != null) { // check if the right child exists
            // draw a line from the current node to the right child
            getChildren().add(new Line(x + hGap, y + 50, x, y));
            displayTree(root.right, x + hGap, y + 50, hGap / 2);
        }
        // draw the current node as a circle with its value inside
        Circle circle = new Circle(x, y, 15);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().addAll(circle, new Text(x - 5, y + 5, root.element.toString()));
    }
}