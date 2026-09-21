class Solution {
	public Node removeDuplicates(Node head) {
		
		if (head == null)
			return null;
		
		HashSet<Integer> seen = new HashSet<>();
		Node curr = head;
		Node prev = null;
		
		while (curr != null) {
			if (seen.contains(curr.data)) {
				prev.next = curr.next;
				curr = prev.next;
			}
			else {
				seen.add(curr.data);
				prev = curr;
			}
			curr = prev != null ? prev.next : null;
		}
		return head;
	}
}
