class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
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
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class LinkedListIntersection {
    public static SinglyLinkedList findIntersection(SinglyLinkedList list1, SinglyLinkedList list2) {
        Node temp1 = list1.head, temp2 = list2.head;
        SinglyLinkedList result = new SinglyLinkedList();
        Node dummy = new Node(0);
        Node tail = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                tail.next = new Node(temp1.data);
                tail = tail.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else if (temp1.data < temp2.data) {
                temp1 = temp1.next;
            } else {
                temp2 = temp2.next;
            }
        }

        result.head = dummy.next;
        return result;
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.append(10);
        list1.append(20);
        list1.append(30);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.append(15);
        list2.append(20);
        list2.append(30);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        SinglyLinkedList intersection = findIntersection(list1, list2);
        System.out.println("Intersection List:");
        intersection.printList();
    }
}
