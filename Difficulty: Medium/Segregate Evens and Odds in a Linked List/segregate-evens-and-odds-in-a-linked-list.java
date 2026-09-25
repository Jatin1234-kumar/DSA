/* Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}*/

class Solution {
    Node divide(Node head) {
        // code here
        Node even=new Node(-1);
        Node odd=new Node(-1);
        Node e1=even;
        Node o1=odd;
        Node temp=head;
        while(temp!=null){
            if(temp.data%2==0){
                e1.next=temp;
                e1=e1.next;
            } else{
                o1.next=temp;
                o1=o1.next;
            }
            temp=temp.next;
        }
        e1.next=odd.next;
        o1.next=null;
        return even.next;
    }
}