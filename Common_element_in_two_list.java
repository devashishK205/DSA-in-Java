// A simple Java program to find common elements in two lists (arrays)

import java.util.ArrayList;

public class Common_element_in_two_list {

    public static void findCommon(int[] list1, int[] list2) { // Method to find common elements between two lists (arrays)

        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) { // Loop through each element in the first list (array)
            for (int j = 0; j < list2.length; j++) { // Loop through each element in the second list (array)
                if (list1[i] == list2[j]) { // If the current element in the first list is equal to the current element in the second list, it means we have found a common element
                    common.add(list1[i]); // Add the common element to the 'common' ArrayList
                }
            }
        }

        System.out.println("Common Elements: " + common); // Print the list of common elements found between the two lists (arrays)
    }

    public static void main(String[] args) {

        int[] list1 = {1, 2, 3, 4}; // First list (array) containing the elements 1, 2, 3, and 4
        int[] list2 = {3, 4, 5, 6}; // Second list (array) containing the elements 3, 4, 5, and 6

        findCommon(list1, list2); // Call the method to find common elements between list1 and list2
    }
}