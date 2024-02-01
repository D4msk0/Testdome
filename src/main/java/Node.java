class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        if (this == null || (leftChild == null && rightChild == null)) {
            // If the current node is null or a leaf, height is 0.
            return 0;
        } else {
            // Calculate height recursively for left and right subtrees.
            int leftHeight = (leftChild == null) ? 0 : leftChild.height();
            int rightHeight = (rightChild == null) ? 0 : rightChild.height();
            // Return the maximum height of left or right subtree plus 1 for the current level.
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}