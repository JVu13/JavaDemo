package Java_Demo.linkedlists;

public class LinkedList {
    Node head;

    public LinkedList() {}
    
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printLinkedLists() {
        if (head == null) return;

        Node current = head;
        System.out.println("Printing Linked List: ");

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
}
