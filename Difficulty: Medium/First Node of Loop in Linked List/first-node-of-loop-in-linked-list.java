/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        Node slow = head;
        Node fast = head;
        Node pos = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                pos = head;

                while (pos != fast) {
                    pos = pos.next;
                    fast = fast.next;
                }

                return pos.data;
            }
        }

        return -1;
    }
}