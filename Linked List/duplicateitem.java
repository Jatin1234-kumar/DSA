//  This is the solution of leetcode problem 83. Remove Duplicates from Sorted List
// This solution aims to remove duplicate items from a sorted linked list. the approach involves traversing the list and checking for consecutive nodes with the same value. when a duplicate is found, it is removed by adjusting the next pointer of the current node to skip over the duplicate node. 
// This process continues until the end of the list is reached, ensuring that all duplicates are removed and only unique values remain in the linked list. 
// The time complexity of this solution is O(n), where n is the number of nodes in the linked list, as it requires a single pass through the list. The space complexity is O(1) since no additional data structures are used that grow with the input size.

//  This is the solution of leetcode problem 83. Remove Duplicates from Sorted List
// This solution aims to remove duplicate items from a sorted linked list. the approach involves traversing the list and checking for consecutive nodes with the same value. when a duplicate is found, it is removed by adjusting the next pointer of the current node to skip over the duplicate node. 
// This process continues until the end of the list is reached, ensuring that all duplicates are removed and only unique values remain in the linked list. 
// The time complexity of this solution is O(n), where n is the number of nodes in the linked list, as it requires a single pass through the list. The space complexity is O(1) since no additional data structures are used that grow with the input size.


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
