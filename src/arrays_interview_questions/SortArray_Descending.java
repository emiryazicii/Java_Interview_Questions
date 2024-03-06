package arrays_interview_questions;

import java.util.Arrays;

/**
 * This class contains a method to sort an integer array in descending order.
 */
public class SortArray_Descending {


     //The main method to test the sortDescending method.
    public static void main(String[] args) {
        // Test the sortDescending method and print the result
        System.out.println(Arrays.toString(sortDescending(new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6})));
    }

    /**
     * Sorts the given array in descending order (largest to smallest).
     * @param arr The integer array to sort.
     * @return The sorted array.
     */
    public static int[] sortDescending(int[] arr) {
        // Iterate through the array using nested loops for bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // If the current element is smaller than the next element, swap them
                if (arr[j] < arr[j + 1]) {
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
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */