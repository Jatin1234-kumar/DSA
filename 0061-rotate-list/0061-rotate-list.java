/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getLength(ListNode head) {
        int count = 0;

        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null || head.next == null)
            return head;

        int n = getLength(head);
        k = k % n;

        if (k == 0)
            return head;

        for (int i = 0; i < k +1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next;
        ListNode temp = a;
        slow.next = null;
        while (a.next != null) {
            a = a.next;
        }
        a.next = head;
        head = temp;
        return head;
    }
}