//Q. Search an Element in a 2D Array
//Problem Statement:
//Write a Java program to search for a given element in a two-dimensional array. The program should return whether the element is present in the array or not.

import java.util.Scanner;

public class SearcharraUtility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] numArr = UtilityArraySA.twodinput();

        // System.out.println("");

        System.out.print("Enter the number which you want to search : ");
        int num = sc.nextInt(); // Search the number

        // call the function
        boolean isnum = searchArr(numArr, num);
        if (isnum) {
            System.out.println("Given number is found in array");
        } else {
            System.out.println("Given number is not found in array");
        }

        sc.close();

    }

    // traverser in function to search the elements
    public static boolean searchArr(int[][] numArr, int num) {
        int i = 0;
        while (i < numArr.length) {

            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;

        }
        return false;

    }

}
// Explanation --
// This program performs a linear search in a 2D array. It takes a number from
// the user and checks each element of the array using nested loops. If the
// number is found, the function returns true; otherwise, it returns false.
// Based on the result, the program displays whether the number is present in
// the array or not.
