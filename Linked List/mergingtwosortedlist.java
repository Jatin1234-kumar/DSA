// Java program to merge two sorted linked lists - There are two approaches to solve this problem - iterative and recursive. 

// Approach 1 - we are implementing the iterative approach. In this approach, we maintain three pointers: two for traversing the input linked lists and one for building the merged linked list. We compare the data of the nodes pointed to by the two traversal pointers and append the smaller node to the merged list. This process continues until we reach the end of one of the input lists. Finally, we append any remaining nodes from the other list to the merged list. The time complexity of this solution is O(n + m), where n and m are the lengths of the two linked lists, as we traverse each list once. The space complexity is O(1) since we are only using a constant amount of extra space for pointers.

// Approach 2 - we are implementing the recursive approach. In this approach, we define a recursive function that takes two nodes (one from each linked list) as input. The base cases handle scenarios where one of the lists is empty, returning the other list. For the recursive case, we compare the data of the two nodes and recursively call the function with the next node of the chosen node and the other node. This continues until we reach the base cases. The time complexity remains O(n + m) due to traversing both lists, but the space complexity is O(n + m) as well, due to the recursion stack.


public class mergingtwosortedlist {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head1 = null;
    Node head2 = null;
    Node head3 = null;


    // This is approach 1 - iterative approach
    public void merging() {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                if (head3 == null) {
                    head3 = new Node(temp1.data);
                    temp3 = head3;
                } else {
                    temp3.next = new Node(temp1.data);
                    temp3 = temp3.next;
                }
                temp1 = temp1.next;

            } else if (temp1.data > temp2.data) {
                if (head3 == null) {
                    head3 = new Node(temp2.data);
                    temp3 = head3;
                } else {
                    temp3.next = new Node(temp2.data);
                    temp3 = temp3.next;
                }
                temp2 = temp2.next;

            } else { 
                if (head3 == null) {
                    head3 = new Node(temp1.data);
                    temp3 = head3;
                } else {
                    temp3.next = new Node(temp1.data);
                    temp3 = temp3.next;
                }

                temp3.next = new Node(temp2.data);
                temp3 = temp3.next;

                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            temp3.next = new Node(temp1.data);
            temp3 = temp3.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            temp3.next = new Node(temp2.data);
            temp3 = temp3.next;
            temp2 = temp2.next;
        }
    }

    // This is approach 2 - recursive approach
   public Node mergeRecursive(Node l1, Node l2) {
    if(l1 == null) return l2;
    if(l2 == null) return l1;

    if(l1.data<l2.data){
        l1.next = mergeRecursive(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeRecursive(l1, l2.next);
        return l2;
    }
   }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Using iterative approach
        mergingtwosortedlist list = new mergingtwosortedlist();
        list.head1 = list.new Node(1);
        list.head1.next = list.new Node(3);
        list.head1.next.next = list.new Node(5);
        list.head1.next.next.next = list.new Node(7);
        list.head1.next.next.next.next = list.new Node(9);

        list.head2 = list.new Node(2);
        list.head2.next = list.new Node(4);
        list.head2.next.next = list.new Node(5);
        list.head2.next.next.next = list.new Node(8);
        list.head2.next.next.next.next = list.new Node(10);

        System.out.println("First Sorted Linked List:");
        list.printList(list.head1);

        System.out.println("Second Sorted Linked List:");
        list.printList(list.head2);

        list.merging();

        System.out.println("Merged Sorted Linked List:");
        list.printList(list.head3);

        // Using recursive approach
        mergingtwosortedlist list2 = new mergingtwosortedlist();    
        list2.head1 = list2.new Node(1);
        list2.head1.next = list2.new Node(3);
        list2.head1.next.next = list2.new Node(5);
        list2.head1.next.next.next = list2.new Node(7);
        list2.head1.next.next.next.next = list2.new Node(9);

        list2.head2 = list2.new Node(2);
        list2.head2.next = list2.new Node(4);
        list2.head2.next.next = list2.new Node(5);
        list2.head2.next.next.next = list2.new Node(8);
        list2.head2.next.next.next.next = list2.new Node(10);
        Node mergedHead = list2.mergeRecursive(list2.head1, list2.head2);
        System.out.println("Merged Sorted Linked List using Recursive Approach:");
        list2.printList(mergedHead);
    }
}
