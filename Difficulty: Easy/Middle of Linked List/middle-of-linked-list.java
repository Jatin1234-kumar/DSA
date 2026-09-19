/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        
        Node temp2=head;
        if(count%2==0){
            int count2=1;
            while(count2<(count/2)){
                count2++;
                temp2=temp2.next;
            }
            return temp2.next.data;
        }else{
            int count2=1;
            while(count2<(count/2)){
                count2++;
                temp2=temp2.next;
            }
            return temp2.next.data;
        }
    }
}