// Floyd's Cycle Detection Algorithm in a Linked List- In this approach we use two pointers, one moving twice as fast as the other. If there is a cycle, the fast pointer will eventually meet the slow pointer. If the fast pointer reaches the end of the list, then there is no cycle. The time complexity is O(n) and the space complexity is O(1).

public class linkedlistcycledetection {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node head = null;

    public boolean CycleDetection() {

        Node fast = head;
        Node slow = head;

        if (head == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlistcycledetection list = new linkedlistcycledetection();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.head;
        System.out.println("Cycle detected: " + list.CycleDetection());
    }
}
