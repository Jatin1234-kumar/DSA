/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        int count = lengthoflist(head);
        if(count%2==0){
            int result=count/2;
            int counter=1;
            Node temp1=head;
            Node temp2=head;
            while(counter!=result){
                temp1=temp1.next;
                temp2=temp2.next;
                counter+=1;
            }
            temp2=temp2.next;
            temp1.next=head;
            Node temp3=temp2;
            while(temp3.next!=head){
                temp3=temp3.next;
            }
            temp3.next=temp2;
            return new Pair<>(head, temp2);
        }else{
            int result = (int) Math.ceil(count / 2);
            int counter=0;
            Node temp1=head;
            Node temp2=head;
            while(counter!=result){
                temp1=temp1.next;
                temp2=temp2.next;
                counter+=1;
            }
            temp2=temp2.next;
            temp1.next=head;
            Node temp3=temp2;
            while(temp3.next!=head){
                temp3=temp3.next;
            }
            temp3.next=temp2;
            return new Pair<>(head, temp2);
        }
    }
    
    public int lengthoflist(Node head){
        int length=1;
        Node temp=head.next;
        while(temp!=head){
            temp=temp.next;
            length+=1;
        }
        return length;
    }
}