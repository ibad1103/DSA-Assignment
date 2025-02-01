class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void removeNode(Node node) {
        if (node == null) return;
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        if (node == head) head = node.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ⇔ ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public Node getNodeAtPosition(int position) {
        int count = 0;
        Node temp = head;
        while (temp != null && count < position) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);

        System.out.println("Original List:");
        dll.printList();

        Node nodeToRemove = dll.getNodeAtPosition(2);
        dll.removeNode(nodeToRemove);

        System.out.println("After Removal:");
        dll.printList();
    }
}
