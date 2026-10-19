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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       int[] ans = {-1, -1};

        if (head == null || head.next == null || head.next.next == null) {
            return ans;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode fwd=head.next.next;
        int count=1;
        int firstind=-1;
        int lastind=-1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(fwd!=null){
            if((curr.val<prev.val && curr.val<fwd.val) || (curr.val>prev.val && curr.val>fwd.val)){
                if (firstind == -1) {
                    firstind = count;
                } else {
                    min = Math.min(min, count - lastind);
                }

                lastind = count;
                count++;
                prev=prev.next;
                curr=curr.next;
                fwd=fwd.next;
            }else{
                count++;
                prev=prev.next;
                curr=curr.next;
                fwd=fwd.next;
            }
        }
         if (firstind == lastind) {
            return ans;
        }

        ans[0] = min;
        ans[1] = lastind - firstind;

        return ans;
    }
}