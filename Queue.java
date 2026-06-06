//Queue Implementation Using Array in Java

//Introduction --
//A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. In a queue, the element that is inserted first is removed first. Elements are inserted at the rear end and removed from the front end.
//Queues are widely used in operating systems, scheduling algorithms, printer management systems, and customer service applications where requests are processed in the order they arrive.
//This program implements a queue using an array and provides operations such as Enqueue, Dequeue, Peek, Display, and Delete Queue.

import java.util.Scanner;

public class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    // Constructor
    public Queue(int size) { // constructor of queue
        capacity = size; // size of queue
        arr = new int[capacity]; // create array of queue
        front = 0; // front of queue
        rear = -1; // rear of queue
    }

    // Check if queue is empty
    public boolean isEmpty() { // check queue is empty or not
        return rear < front; // If rear is less than front, it means the queue is empty
    }

    // Check if queue is full
    public boolean isFull() { // check queue is full or not
        return rear == capacity - 1; // If rear is equal to capacity - 1, it means the queue is full
    }

    // Insert element
    public void enqueue(int value) { // insert element in queue
        if (isFull()) { // If the queue is full, we cannot insert a new element
            System.out.println("Queue is full, cannot insert");
            return;
        }

        arr[++rear] = value; // Increment rear and insert the new value at the rear of the queue
        System.out.println(value + " inserted into queue"); // Print a message indicating that the value has been inserted
    }

    // Remove element
    public void dequeue() {
        if (isEmpty()) { // If the queue is empty, we cannot remove an element
            System.out.println("Queue is empty, cannot delete");
            return;
        }

        System.out.println(arr[front] + " removed from queue"); // Print a message indicating that the value has been removed
        front++; // Increment front to point to the next element in the queue
    }

    // Display front element
    public void frontElement() { // Display the front element of the queue
        if (isEmpty()) { // If the queue is empty, there is no front element to display
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element is: " + arr[front]); // Print the front element of the queue
    }

    // Display queue
    public void display() {
        if (isEmpty()) { // If the queue is empty, there are no elements to display
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements are: ");
        for (int i = front; i <= rear; i++) { // Iterate through the queue from front to rear and print each element
            System.out.print(arr[i] + " "); // Print the current element followed by a space for separation         
        }
        System.out.println();
    }

    // Delete queue
    public void deleteQueue() {
        arr = null;
        front = 0;
        rear = -1;
        capacity = 0;
        System.out.println("Queue has been deleted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue obj = new Queue(5);
        System.out.println("Queue has been created");

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Display");
            System.out.println("3. Dequeue");
            System.out.println("4. Peek");
            System.out.println("5. Delete Queue");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: "); // Prompt the user to enter their choice for the queue operation
            int choice = sc.nextInt();

            if (choice == 1) { // If the user chooses to enqueue an element, prompt them to enter the value and call the enqueue method
                System.out.print("Enter value to enqueue: ");
                int value = sc.nextInt();
                obj.enqueue(value); // Call the enqueue method to insert the value into the queue
            } 
            else if (choice == 2) {
                obj.display();
            } 
            else if (choice == 3) {
                obj.dequeue();
            } 
            else if (choice == 4) {
                obj.frontElement();
            } 
            else if (choice == 5) {
                obj.deleteQueue();
            } 
            else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

//Conclusion
//This program demonstrates the implementation of a queue using an array in Java. The queue follows the FIFO principle, ensuring that elements are processed in the order they are inserted. The program supports essential queue operations such as Enqueue, Dequeue, Peek, Display, and Delete Queue, making it a fundamental example of queue data structure implementation.