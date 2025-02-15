class Node {
    int val;
    Node left, right;

    public Node(int val) {
        this.val = val;
    }
}

public class BinaryTreeFunctions {
    public static int height(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        System.out.println("Height of the tree: " + height(root));
        System.out.println("Maximum value in the tree: " + max(root));
        System.out.println("Sum of all nodes: " + sum(root));
        System.out.println("Size of the tree: " + size(root));
    }
}
