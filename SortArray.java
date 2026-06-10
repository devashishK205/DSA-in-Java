// Q. Sort an Array in Ascending Order
// Problem Statement:
// Write a Java program to sort the elements of an array in ascending order using the built-in Arrays.sort() method and display the array before and after sorting.

import java.util.Arrays;

public class SortArray {

    public static void show(int[] arr) {
        for (int num : arr) { // Iterate through each element in the array
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 9, -6, 7, -3, 4, 2, 0}; // Initialize an array with unsorted integers

        System.out.println("Array before sorting:");
        show(arr);

        Arrays.sort(arr);

        System.out.println("\n\nArray after sorting:");
        show(arr);
    }
}

// Explanation --
// This program sorts the elements of an array in ascending order using Java's built-in Arrays.sort() method. 
// The array is displayed before and after sorting to show the change in order. The sorting process arranges the 
// elements from the smallest value to the largest value.