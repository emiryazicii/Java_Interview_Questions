package arrays_interview_questions;

import java.util.Arrays;

/**
 * This class contains a method to sort an integer array in ascending order.
 */
public class SortArray_Ascending {


     //The main method to test the sortAscending method.
    public static void main(String[] args) {
        // Test the sortAscending method and print the result
        System.out.println(Arrays.toString(sortAscending(new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6})));
    }

    /**
     * Sorts the given array in ascending order (smallest to largest).
     * @param arr The integer array to sort.
     * @return The sorted array.
     */
    public static int[] sortAscending(int[] arr) {
        // Iterate through the array using nested loops for bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Return the sorted array
        return arr;
    }
}

  /*
        Sort Array Ascending

        Create a method that will sort the given array in ascending order (smallest to largest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [-1, 1, 1, 2, 3, 3, 4, 5, 6, 6, 8]

     */
