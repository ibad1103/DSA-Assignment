import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class BFS {
    public static void traverseBFS(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node x = queue.poll();
            System.out.print(x.data + " ");

            if (x.left != null) queue.add(x.left);
            if (x.right != null) queue.add(x.right);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Node root = new Node(5);
        root.left = new Node(6);
        root.right = new Node(7);
        root.right.left = new Node(4);
        root.right.right = new Node(9);

        
        System.out.print("BFS (Level-order): ");
        traverseBFS(root);
    }
}
