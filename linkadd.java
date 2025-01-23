class Node {
    int info;
    Node next;

    public Node(int info) {
        this.info = info;
        this.next = null;
    }
}

public class linkadd {
    Node head;

    public void add(int newdata) {
        Node newnode = new Node(newdata);
        newnode.next = head;
        head = newnode;
    }

    public void delete(int idx) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (idx == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < idx - 1; i++) {
            if (current.next == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        current.next = current.next.next;
    }

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.info + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle Element: " + slow.info);
    }

    static linkadd merge(linkadd list1, linkadd list2) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node l1 = list1.head;
        Node l2 = list2.head;

        while (l1 != null && l2 != null) {
            if (l1.info > l2.info) {
                tail.next = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                l1 = l1.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;

        linkadd mergedList = new linkadd();
        mergedList.head = dummy.next;
        return mergedList;
    }

    public static void main(String[] args) {
        linkadd list1 = new linkadd();
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        linkadd list2 = new linkadd();
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.add(5);

        list1.findMiddle();
        list1.reverse();
        list1.printlist();
        list2.printlist();

        linkadd mergedList = merge(list1, list2);
        mergedList.printlist();
    }
}
