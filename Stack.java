// Stack implementation in Java 

//Introduction --
//A Stack is a linear data structure that follows the LIFO (Last In, First Out) principle. This means that the element inserted last is the first one to be removed. Stack operations are performed only at one end called the Top.
//In this program, a stack is implemented using an array and supports operations such as Push, Pop, Peek, Display, and Delete.

import java.util.Scanner;

public class Stack {
    private int size;
    private int top;
    private int[] arr;

    // Constructor
    public Stack(int s) {
        size = s;
        arr = new int[size];
        top = -1;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }

        arr[++top] = value;
        System.out.println("Element has pushed");
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Popped element: " + arr[top]);
        top--;
    }

    // Delete operation (deletes a specific value from the stack)
    public void delete(int value) {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int index = -1;
        for (int i = top; i >= 0; i--) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element " + value + " not found in the stack");
            return;
        }

        // Shift elements above the deleted element down to fill the gap
        for (int i = index; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        top--;
        System.out.println("Element " + value + " has been deleted");
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Top element: " + arr[top]);
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println("[" + arr[i] + "]");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack st = new Stack(10); // stack size = 10
        System.out.println("Stack has created");

        while (true) { 
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter element to push: ");
                int val = sc.nextInt();
                st.push(val);
            } else if (choice == 2) {
                st.pop();
            } else if (choice == 3) {
                st.display();
            } else if (choice == 4) {
                st.peek();
            } else if (choice == 5) {
                System.out.print("Enter element to delete: ");
                int val = sc.nextInt();
                st.delete(val);
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}

//This program demonstrates the implementation of a stack using an array in Java. It supports all fundamental stack operations including Push, Pop, Peek, Display, and Delete. The stack follows the LIFO principle and provides efficient insertion and deletion operations at the top of the stack.