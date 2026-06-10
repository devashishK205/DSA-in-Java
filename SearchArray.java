//Q. Search an Element in a 1D Array
//Problem Statement:
//Write a Java program to search for a given element in a one-dimensional array. The program should return whether the element is present in the array or not.

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Search Array");
        int[] numarr = { 11, 55, 45, 78, 89, 25, 75, 62, 51, 87, 23, 32, 55 };

        System.out.print("Enter the number which you want to search : ");
        int num = sc.nextInt(); // Search the number

        // call the function
        boolean arrfound = arrfound(numarr, num);
        if (arrfound) {
            System.out.println("Given number is found in array");
        } else {
            System.out.println("Given number is not found in array");
        }

        sc.close();

    }

    // traverser in function to search the elements
    public static boolean arrfound(int[] numarr, int num) {
        int i = 0;
        while (i < numarr.length) {
            if (numarr[i] == num) {
                return true;
            }
            i++;

        }
        return false;

    }
}

// Explanation --
// This program performs a linear search on a one-dimensional array. It takes a
// number from the user and checks each element of the array one by one using a
// loop. If the entered number matches any element in the array, the method
// returns true; otherwise, it returns false after checking all elements.
// Based on the result, the program displays whether the number is found or not
// found in the array.