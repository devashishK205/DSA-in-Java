// Q. Perform Basic Stack Operations Using Java
// Problem Statement:
//Write a Java program to demonstrate basic stack operations such as push, pop, peek, and traversal using the Stack class.

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) { 

        Stack<Integer> stack = new Stack<>(); // Create a stack to hold Integer values

        stack.push(21); 
        stack.push(22);
        stack.push(24);
        stack.push(25);

        System.out.println(stack.peek()); // View the top element of the stack without removing it

        int num = 0; // Variable to hold the value to be pushed onto the stack
        stack.push(num); // Push the value of num (which is 0) onto the stack

        stack.pop(); // Remove the top element from the stack (which is 0) and discard it, leaving the previous top element (25) as the new top of the stack
        stack.pop(); // Remove the top element from the stack (which is 25) and discard it, leaving the previous top element (24) as the new top of the stack

        while (!stack.isEmpty()) { // Traverse the stack and print each element until the stack is empty
            System.out.print(stack.peek() + " "); 
            stack.pop(); // Remove the top element after printing it to move to the next element in the stack
        }
    }
}

// Explanation -
// This program demonstrates the implementation of a stack using Java's Stack class.
// Elements are added to the stack using the push() method and removed using the pop() method. 
// The peek() method is used to view the top element without removing it. Finally, the program displays all remaining elements by repeatedly removing them from the stack.

// A stack follows the LIFO (Last In, First Out) principle, where the last element inserted is the first element removed.