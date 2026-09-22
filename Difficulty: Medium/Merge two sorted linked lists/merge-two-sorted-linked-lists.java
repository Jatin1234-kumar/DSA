class Solution {
    Node sortedMerge(Node head1, Node head2) {

        Node curr1 = head1;
        Node curr2 = head2;
        Node prev1 = null;
        Node prev2 = null;

        // Empty list cases
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        while (curr1 != null && curr2 != null) {

            if (curr1.data > curr2.data) {

                Node next2 = curr2.next;

                if (prev1 == null) {
                    curr2.next = curr1;
                    head1 = curr2;
                } 
                else {
                    prev1.next = curr2;
                    curr2.next = curr1;
                }

                prev1 = curr2;
                curr2 = next2;

            } 
            else {
                prev1 = curr1;
                curr1 = curr1.next;
            }
        }

        // Remaining nodes of list 2
        if (curr2 != null) {
            if (prev1 != null) {
                prev1.next = curr2;
            } else {
                head1 = curr2;
            }
        }

        return head1;
    }
}