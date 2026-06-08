// Merge Sort implementation in Java

public class MergeSort {

    // Merge function
    public static void conquer(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1]; // Create a temporary array to hold the merged result. The size of this array is determined by the range of indices from si to ei (inclusive).

        int idx1 = si; // Pointer for the first half of the array (starting at si)
        int idx2 = mid + 1; // Pointer for the second half of the array (starting at mid + 1)
        int x = 0; // Pointer for the merged array

        // Compare elements of both halves
        while (idx1 <= mid && idx2 <= ei) { // Loop until we reach the end of either half

            if (arr[idx1] <= arr[idx2]) { // If the current element in the first half is less than or equal to the current element in the second half
                merged[x++] = arr[idx1++]; // Add the element from the first half to the merged array and move the pointer of the first half forward
            } else { // If the current element in the second half is less than the current element in the first half
                merged[x++] = arr[idx2++]; // Add the element from the second half to the merged array and move the pointer of the second half forward
            }
        }

        // Remaining elements of first half
        while (idx1 <= mid) { // If there are still elements left in the first half after the above loop, add them to the merged array
            merged[x++] = arr[idx1++]; // Add the remaining elements from the first half to the merged array and move the pointer of the first half forward
        }

        // Remaining elements of second half
        while (idx2 <= ei) { // If there are still elements left in the second half after the above loop, add them to the merged array
            merged[x++] = arr[idx2++]; // Add the remaining elements from the second half to the merged array and move the pointer of the second half forward
        }

        // Copy merged array back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) { // Copy the sorted elements from the merged array back to the original array (arr) starting from index si
            arr[j] = merged[i]; // Update the original array with the sorted elements from the merged array
        }
    }

    // Divide function
    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) { // Base case: If the starting index is greater than or equal to the ending index, it means we have a single element or an invalid range, so we can return without doing anything
            return;
        }

        int mid = si + (ei - si) / 2; // Calculate the middle index to divide the array into two halves. This is done to avoid potential overflow issues that can arise with large indices when using (si + ei) / 2.

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);
    }

    // Main function
    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length; // Get the length of the array

        divide(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) { // Loop through the sorted array and print each element
            System.out.print(arr[i] + " "); // Print the current element followed by a space for better readability
         }

        System.out.println();
    }
}