/*
class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
} */

class Solution {
	public boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}
		Node fast = head;
		Node slow = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		Node firsthalf = head;
		Node secondhalf = reverse(slow);
		
		while (secondhalf != null) {
			if (firsthalf.data != secondhalf.data)
				return false;
			
			firsthalf = firsthalf.next;
			secondhalf = secondhalf.next;
		}
		
		return true;
	}

public Node reverse(Node slow) {
	Node curr = slow;
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


