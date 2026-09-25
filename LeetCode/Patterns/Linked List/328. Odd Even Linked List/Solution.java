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
    public ListNode oddEvenList(ListNode head) {
        ListNode even=new ListNode(-1);
        ListNode odd=new ListNode(-1);
        ListNode e1=even;
        ListNode o1=odd;
        ListNode temp=head;
            int index=1;
        while(temp!=null){
            if(index%2==0){
                e1.next=temp;
                e1=e1.next;
            } else{
                o1.next=temp;
                o1=o1.next;
            }
            temp=temp.next;
            index++;
        }
        o1.next=even.next;
        e1.next=null;
        return odd.next;
    }
}