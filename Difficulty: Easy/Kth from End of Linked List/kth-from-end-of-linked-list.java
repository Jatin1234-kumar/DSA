/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        int count = 0;
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }

            if(k>count){
                return -1;
            }
            
            int count2=0;
            Node slow=head;
            Node fast=head;
            while(count2<k){
                count2++;
                fast=fast.next;
            }
            while(fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow.data;
    }
}