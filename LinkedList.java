// A simple implementation of a singly linked list in Java

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedList {

    static Node head = null;

    public static void insertAtBeginning(int value) {
        Node newNode = new Node(value); // Create a new node with the given value
        newNode.next = head; // Point the new node's next to the current head of the list
        head = newNode;  // Update the head to be the new node, effectively inserting it at the beginning of the list
    }

    public static void insertAtEnd(int value) {
        Node newNode = new Node(value); // Create a new node with the given value

        if (head == null) { // If the list is empty, set the new node as the head of the list
            head = newNode; // Update the head to be the new node, effectively inserting it as the first element in the list
            return;
        }

        Node temp = head; // Start from the head of the list and traverse to the end
        while (temp.next != null) { // Traverse the list until we reach the last node (where temp.next is null)
            temp = temp.next; // Move to the next node in the list
        }

        temp.next = newNode; // Once we reach the last node, set its next pointer to the new node, effectively inserting it at the end of the list
    }

    public static void display() {
        if (head == null) { // If the list is empty, print a message indicating that the linked list is empty and return
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) { // Traverse the list starting from the head and print each node's data until we reach the end of the list (where temp is null)
            System.out.print(temp.data + " -> ");
            temp = temp.next; // Move to the next node in the list
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(40);
        insertAtBeginning(5);

        display();
    }
}