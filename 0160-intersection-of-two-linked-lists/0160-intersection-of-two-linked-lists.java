/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = getLength(headA);
    int lenB = getLength(headB);

    int diff = Math.abs(lenA - lenB);
    if (lenA > lenB) {
        while (diff > 0) {
            headA = headA.next;
            diff--;
        }
    } 
    else {
        while (diff > 0) {
            headB = headB.next;
            diff--;
        }
    }
    while (headA != headB) {
        headA = headA.next;
        headB = headB.next;
    }

    return headA;
    }

    public int getLength(ListNode head) {
    int count = 0;
    ListNode temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count;
}
}