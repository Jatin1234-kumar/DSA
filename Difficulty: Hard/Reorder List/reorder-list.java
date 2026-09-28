/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public void reorderList(Node head) {
        
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next=null;
        secondHalf = reverse(secondHalf);
        Node firstHalf = head;

        while (secondHalf != null) {
            Node next1 = firstHalf.next;
            Node next2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = next1;

            firstHalf = next1;
            secondHalf = next2;
        }
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}