/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node temp=head;
        Node forward;
        Node prev=null;
        while(temp!=null){
            forward=temp.next;
            temp.next=prev;
            temp.prev=forward;
            prev=temp;
            temp=forward;
        }
        return prev;
    }
}