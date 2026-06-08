// This program checks if two strings are anagrams of each other. 

import java.util.Arrays;
import java.util.Scanner;

public class StringAng {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        // Convert to lowercase and remove spaces
        str1 = str1.toLowerCase().replaceAll("\\s", ""); // Convert the first string to lowercase and remove all whitespace characters (spaces, tabs, etc.) using replaceAll with a regular expression that matches any whitespace character (\\s) and replaces it with an empty string ("").
        str2 = str2.toLowerCase().replaceAll("\\s", ""); // Convert the second string to lowercase and remove all whitespace characters (spaces, tabs, etc.) using replaceAll with a regular expression that matches any whitespace character (\\s) and replaces it with an empty string ("").  

        if (str1.length() != str2.length()) { // If the lengths of the two strings are different, they cannot be anagrams, so we can directly print that they are not anagrams and skip the sorting and comparison steps.
            System.out.println("Strings are not Anagram");
        } else {

            char[] char_arr1 = str1.toCharArray(); // Convert the first string to a character array using the toCharArray() method, which creates an array of characters from the string. This allows us to sort the characters and compare them later.
            char[] char_arr2 = str2.toCharArray(); // Convert the second string to a character array using the toCharArray() method, which creates an array of characters from the string. This allows us to sort the characters and compare them later.

            Arrays.sort(char_arr1); // Sort the character array of the first string using the Arrays.sort() method, which sorts the characters in ascending order. This is necessary to compare the characters of both strings in a consistent order.
            Arrays.sort(char_arr2); // Sort the character array of the second string using the Arrays.sort() method, which sorts the characters in ascending order. This is necessary to compare the characters of both strings in a consistent order.

            if (Arrays.equals(char_arr1, char_arr2)) {
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Strings are not Anagram");
            }
        }

        sc.close();
    }
}