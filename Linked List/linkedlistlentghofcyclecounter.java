// Java program to find length of cycle in a linked list - We can use Floyd's Cycle Detection Algorithm to first detect the cycle in the linked list. Once a cycle is detected, we can keep one pointer fixed at the meeting point and move the other pointer around the cycle until it meets the fixed pointer again. The number of nodes traversed in this process gives us the length of the cycle. The time complexity is O(n) and the space complexity is O(1).

public class linkedlistlentghofcyclecounter {
    private class Node {
        Node next;

        Node(int value) {
            this.next = null;
        }
    }

    Node head = null;

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
                int cycleLength =1;
                while (temp.next!=slow){
                    temp=temp.next;
                    cycleLength++;
                }
                return cycleLength;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        linkedlistlentghofcyclecounter list = new linkedlistlentghofcyclecounter();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        list.head.next.next.next = list.head.next; 
        System.out.println("Length of cycle: " + list.lengthOfCycle());
    }
}
