/* Linked List Node Structure
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
	public Node reverseCircular(Node head) {
		Node temp = head;
		Node temp1 = head;
		if (head == null || head.next == head)
			return head;
		
		Node prev = head;
		Node curr = head.next;
		Node nextNode;
		
		while (curr != head) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		
		head.next = prev;
		head = prev;
		
		return head;
	}
}
