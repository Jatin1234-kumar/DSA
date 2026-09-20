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

import java.util.*;
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null){
            stack.push(fast);
            fast=fast.next;
        }
        int count=1;
        while(count<k&&!stack.isEmpty()){
            slow=slow.next;
            fast=stack.pop();
            count++;
        }
        int tempval=slow.val;
        slow.val=fast.val;
        fast.val=tempval;
        return head;
    }
}