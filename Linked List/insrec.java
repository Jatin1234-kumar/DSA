// THis is the solution of inserting a node at a given position using recursion in a linked list.
// The approach involves defining a recursive function that takes the current node, the data to be inserted, and the position as parameters.
// The base case for the recursion is when the position is zero, at which point a new node is created and inserted at the current position.
// If the position is not zero, the function calls itself with the next node and decrements the position by one.
// This continues until the base case is reached, effectively traversing the list recursively.
// The time complexity of this solution is O(n) in the worst case, where n is the number of nodes in the linked list, as it may require traversing the entire list to reach the desired position. The space complexity is also O(n) due to the recursive call stack.



class insrec {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    Node head = null;

    public static void main(String[] args) {
        insrec list = new insrec();
        list.head = list.insertByRec(list.head, 10, 0);
        list.head = list.insertByRec(list.head, 20, 1);
        list.head = list.insertByRec(list.head, 15, 1);
        list.head = list.insertByRec(list.head, 17, 1);
        list.head = list.insertByRec(list.head, 1, 1);
        list.printList();
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node insertByRec(Node node, int data, int pos) {
        if (pos == 0) {
            Node newNode = new Node(data);
            newNode.next = node;
            return newNode;
        }

        node.next = insertByRec(node.next, data, pos - 1);
        return node;
    }
}
