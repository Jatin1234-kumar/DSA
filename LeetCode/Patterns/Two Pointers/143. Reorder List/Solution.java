class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        secondHalf = reverse(secondHalf);

        ListNode firstHalf = head;

        while (secondHalf != null) {
            ListNode next1 = firstHalf.next;
            ListNode next2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = next1;

            firstHalf = next1;
            secondHalf = next2;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}