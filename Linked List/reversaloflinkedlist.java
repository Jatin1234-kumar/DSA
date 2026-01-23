public class reversaloflinkedlist {
     class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head = null;

    public Node reverseListByRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListByRec(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reversaloflinkedlist list = new reversaloflinkedlist();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(5);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        list.head = list.reverseListByRec(list.head);

        System.out.println("Reversed Linked List:");
        list.printList(list.head);
    }
}
