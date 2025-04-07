public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root; // the root of the tree

    /**
     * Construct a default binary tree
     */
    public static class TreeNode<E> {
        E element; // the value of the node
        TreeNode<E> left; // the left child
        TreeNode<E> right; // the right child
        
        /**
         * Construct a tree node with the specified value
         * @param e
         */
        public TreeNode(E e) {
            element = e;
        }
    }
    /*
     * Construct a binary tree with the specified root value
     */
    public TreeNode<E> getRoot() {
        return root; // return the root of the tree
    }
    /**
     * Return true if the element is in the tree
     * @param e
     */
    public boolean search(E e) {
        TreeNode<E> current = root; // start from the root
        while (current != null) { // traverse the tree
            if (e.compareTo(current.element) < 0) { // if the element is less than the current node's value
                current = current.left; // go to the left child
            } else if (e.compareTo(current.element) > 0) { // if the element is greater than the current node's value
                current = current.right; // go to the right child
            } else { // if the element is equal to the current node's value return true
                return true;
            }
        }
        return false;
    }
    /*
     * Insert an element into the binary tree
     * @param e
     * @return true if the element is inserted successfully
     */
    public boolean insert(E e) {
        if (root == null) { // if the tree is empty, create a new root node
            root = new TreeNode<>(e);
            return true;
        }
        TreeNode<E> parent = null; // parent of the current node
        TreeNode<E> current = root; // start from the root
        // traverse the tree to find the correct position for the new node
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                return false;
            }
        }
        // create a new node and attach it to the parent node
        if (e.compareTo(parent.element) < 0) {
            parent.left = new TreeNode<>(e);
        } else {
            parent.right = new TreeNode<>(e);
        }
        return true;
    }
    /**
     * Delete an element from the binary tree
     * @param e
     * @return true if the element is deleted successfully
     */
    public boolean delete(E e) {
        TreeNode<E> parent = null; // parent of the current node
        TreeNode<E> current = root; // start from the root
        // traverse the tree to find the node to be deleted
        while (current != null && !current.element.equals(e)) {
            parent = current;
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        // if the node is not found, return false
        if (current == null) return false;
        // if the node to be deleted has no children, simply remove it
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else if (current == parent.left) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        // if the node to be deleted has only one child, replace it with that child
        } else if (current.right == null) {
            if (parent == null) {
                root = current.left;
            } else if (current == parent.left) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        // if the node to be deleted has two children, find its in-order successor
        } else {
            TreeNode<E> successorParent = current;
            TreeNode<E> successor = current.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }
            current.element = successor.element;
            if (successorParent.left == successor) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }
        }
        return true;
    }
}