/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }
        
        if(key==head.data){
            Node temp=head;
            Node temp1=head;
            head=temp.next;
            if (head.next == head) {
                return null;
            }
            while(temp.next!=temp1){
                temp=temp.next;
            }
            temp.next=head;
            temp1.next=null;
            return head;
        }
        
        Node dummy = new Node(-1);
        Node temp=head;
        while(temp.next != head && temp.data!=key){
            dummy.next=temp;
            temp=temp.next;
            dummy=dummy.next;
        }
        if (temp.data != key) {
            return head;
        }

        dummy.next=temp.next;
        temp.next=null;
        return head;
    }
}