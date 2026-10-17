/* Structure of a doubly link list node
class Node {
	int data;
	Node prev, next;
	Node(int x) {
		data = x;
		prev = null;
		next = null;
	}
} */

class Solution {
	
	public int getLength(Node head) {
		int count = 0;
		
		Node temp = head;
		
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	public Node rotateDLL(Node head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		
		int n = getLength(head);
		k = k % n;
		
		if (k == 0) {
			return head;
		}
		
		Node tail = head;
		
		while (tail.next != null) {
			tail = tail.next;
		}
		
		tail.next = head;
		head.prev = tail;
		
		for (int i = 1; i <= k; i++) {
			head = head.next;
			tail = tail.next;
		}
		
		head.prev = null;
		tail.next = null;
		
		return head;
	}
}
