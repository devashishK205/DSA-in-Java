//Binary Tree Implementation in Java – Theory

//Introduction --
//A Binary Tree is a hierarchical data structure in which each node can have at most two children, known as the left child and right child. The topmost node of the tree is called the root node.
//Binary trees are widely used in computer science for organizing and storing data efficiently. They form the foundation for advanced data structures such as Binary Search Trees (BST), Heaps, and Expression Trees.
//In this program, a simple binary tree is created manually using nodes and references.

public class BinaryTree {

    // Node class
    static class Node { // Node class to represent each node in the binary tree
        int data; // data of node
        Node left; // left child of node
        Node right; // right child of node

        // Constructor
        Node(int value) { // constructor of node
            data = value; // Initialize data with the given value
            left = null; // Initialize left child to null
            right = null; // Initialize right child to null
        }
    }

    public static void main(String[] args) { 

        // Create root node
        Node root = new Node(10); // Create the root node with data value 10

        // Create left and right children
        root.left = new Node(20); // Create the left child of the root node with data value 20
        root.right = new Node(30); // Create the right child of the root node with data value 30

        // Create children of left node
        root.left.left = new Node(40); // Create the left child of the left node with data value 40
        root.left.right = new Node(50); // Create the right child of the left node with data value 50

        root.right.left = new Node(60); // Create the left child of the right node with data value 60
        root.right.right = new Node(70); // Create the right child of the right node with data value 70

        System.out.println("Root Node: " + root.data); // Print the data of the root node
    }
}

    //          10
    //        /    \
    //      20      30
    //     /  \    /  \
    //   40   50  60   70

   //This program demonstrates the basic implementation of a Binary Tree in Java using a Node class. Each node stores data and references to its left and right children. The program creates a tree structure manually and establishes parent-child relationships. It serves as the foundation for understanding more advanced tree-based data structures and algorithms.