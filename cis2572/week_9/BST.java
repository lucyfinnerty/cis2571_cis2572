public class BST<E extends Comparable<E>> {
    protected TreeNode<E> root;

    public static class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E e) {
            element = e;
        }
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public boolean search(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
            return true;
        }
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
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
        if (e.compareTo(parent.element) < 0) {
            parent.left = new TreeNode<>(e);
        } else {
            parent.right = new TreeNode<>(e);
        }
        return true;
    }

    public boolean delete(E e) {
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null && !current.element.equals(e)) {
            parent = current;
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (current == null) return false;
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else if (current == parent.left) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.right == null) {
            if (parent == null) {
                root = current.left;
            } else if (current == parent.left) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
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