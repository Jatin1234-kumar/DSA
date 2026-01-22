// This is leetcode problem 876 - Middle of the Linked List
//we used floyds pointer algo to solve this problem
// we cretead two pointers slow and fast both pointing to head
// then we move fast pointer by two nodes and slow pointer by one node  
// when fast pointer reaches the end of the linked list slow pointer will be at the middle of the linked list
// if the linked list has even number of nodes we return the second middle node
// time complexity is O(n) and space complexity is O(1)

public class middleoflinkedlist {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next==null){
            return slow;
        }
        if(fast.next.next==null){
            return slow.next;
        }
        return null;
    }

    public static void main(String[] args) {
        middleoflinkedlist solution = new middleoflinkedlist();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode middle = solution.middleNode(head);
        System.out.println("Middle Node Value: " + middle.val); 
    }
}