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
	Node mergeKLists(Node[] arr) {
		if (arr.length == 0)
			return null;
		
		Node result = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			result = merge(result, arr[i]);
		}
		
		return result;
	}
	
	Node merge(Node a, Node b) {
		Node dummy = new Node(-1);
		Node temp = dummy;
		
		while (a != null && b != null) {
			if (a.data <= b.data) {
				temp.next = a;
				a = a.next;
			} else {
				temp.next = b;
				b = b.next;
			}
			
			temp = temp.next;
		}
		
		if (a != null) {
			temp.next = a;
		} else {
			temp.next = b;
		}
		
		return dummy.next;
	}
}
