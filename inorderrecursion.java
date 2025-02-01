class DFSRecursive {
    public static void inorder(Node c) {
        if (c != null) {
            inorder(c.left);
            System.out.print(c.data + " ");
            inorder(c.right);
        }
    }

    public static void main(String[] args) {
        
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(9);

        
        System.out.print("DFS (Recursive Inorder): ");
        inorder(root);
        System.out.println();
    }
}
