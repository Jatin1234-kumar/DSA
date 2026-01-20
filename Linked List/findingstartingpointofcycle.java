// Java program to find the starting point of cycle in a linked list - We can use Floyd's Cycle Detection Algorithm to first detect the cycle in the linked list. Once a cycle is detected, we can calculate the length of the cycle. after detection, we can use two pointer both pointing at the head of linked list. Now the intuition is to move one pointer ahead by the length of cycle after moving it ahead, we will move both pointer one step ahead at a time and at a certain node both the pointers will meet which will be the starting point of the cycle. The time complexity is O(n) and the space complexity is O(1).

public class findingstartingpointofcycle {
    private class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node head = null;

    int cycleLength = 1;

    public int lengthOfCycle() {
        Node fast = head;
        Node slow = head;

        if (head == null) {
            return 0;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                Node temp = slow;
                while (temp.next != slow) {
                    temp = temp.next;
                    cycleLength++;
                }
                return cycleLength;
            }
        }
        return 0;
    }

    public void findStartingPoint() {
        int pos = 0;
        Node fast = head;
        Node slow = head;

        if (head == null) {
            return;
        }

        while (cycleLength !=0){
            slow=slow.next;
            cycleLength--;
        }

        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
            pos++;
        }
        System.out.println("Starting point of cycle is: " + fast.data + " at position: " + pos);
    }

    public static void main(String[] args) {
        findingstartingpointofcycle list = new findingstartingpointofcycle();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.head.next;
        list.lengthOfCycle();
        list.findStartingPoint();
    }
}
