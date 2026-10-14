/* Structure of circular linked list node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public void printList(Node head) {
        if (head == null) return;
        Node temp=head;
        System.out.print(temp.data + " ");
        temp = temp.next;
        while(temp!=head){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
}