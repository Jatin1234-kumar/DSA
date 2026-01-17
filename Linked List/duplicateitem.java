public class duplicateitem {
    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head = null;

public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removeDuplicates() {
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            } else{
                temp=temp.next;
            }
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

public static void main(String[] args) {
    duplicateitem list= new duplicateitem();
    list.insert(10);
    list.insert(10);                
    list.insert(20);
    list.insert(30);
    list.insert(30);
    System.out.println("Original list:");
    list.printList();
    list.removeDuplicates();
    System.out.println("List after removing duplicates:");
    list.printList();
}

}
