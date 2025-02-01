import java.util.Stack;

class DFSStack {
    public static void traverseDFS(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node c = stack.pop();
            System.out.print(c.data + " ");

            if (c.right != null) stack.push(c.right);
            if (c.left != null) stack.push(c.left);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(9);

        
        System.out.print("DFS (Stack-based Preorder): ");
        traverseDFS(root);
    }
}
