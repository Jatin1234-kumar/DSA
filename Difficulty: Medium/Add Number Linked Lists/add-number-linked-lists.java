/*
class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
}
*/

class Solution {
	public Node addTwoLists(Node head1, Node head2) {
		
		Node list1 = reverse(head1);
		Node list2 = reverse(head2);
		
		Node dummy = new Node(0);
		Node tail = dummy;
		
		int carry = 0;
		
		while (list1 != null || list2 != null || carry != 0) {
			
			int total = carry;
			
			if (list1 != null) {
				total += list1.data;
				list1 = list1.next;
			}
			
			if (list2 != null) {
				total += list2.data;
				list2 = list2.next;
			}
			
			carry = total / 10;
			int digit = total % 10;
			
			tail.next = new Node(digit);
			tail = tail.next;
		}
		
		Node result = reverse(dummy.next);
		while (result != null && result.data == 0 && result.next!=null) {
			result = result.next;
		}
		
		return result;
	}
	
	Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node next;
		
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
