//Q. Sort an Array and Search an Element Using Binary Search
//Problem Statement:
//Write a Java program to sort an array in ascending order and search for a given element using the Binary Search technique.

import java.util.Arrays;

public class BinarySearchArray {

    public static void show(int[] arr) {
        for (int num : arr) { // Iterate through each element in the array
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 9, 6, 7, 3, 4, 2, 0}; // Initialize an array with unsorted integers

        System.out.println("The array is:");
        show(arr);

        Arrays.sort(arr); // Sort the array in ascending order

        System.out.println("\n\nThe array after sorting is:");
        show(arr);

        int key = 2; // Element to search for in the array

        if (Arrays.binarySearch(arr, key) >= 0) // Search for the element using binary search and check if it is found
            System.out.println("\nElement found in the array");
        else
            System.out.println("\nElement not found in the array");
    }
}

// Explanation --
// This program first sorts the array using the Arrays.sort() method. After sorting, 
// it uses the Arrays.binarySearch() method to search for a specific element in the array. 
// Binary Search works by repeatedly dividing the search space into two halves until the element is found or the search range becomes empty.


// Since Binary Search requires the array to be sorted, sorting is performed before searching. 
// If the element is present, the program displays a success message; otherwise, it indicates that the element is not found.