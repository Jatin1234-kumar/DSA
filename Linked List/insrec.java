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
