package arrays_interview_questions;

import java.util.Arrays;

/**
 * This class contains methods to reverse an integer array.
 */
public class ReverseArray {


     //The main method to test the reverseArray and reverseAnArray methods.
    public static void main(String[] args) {
        // Test the reverseArray method and print the result
        System.out.println(Arrays.toString(reverseArray(new int[]{3, 4, 5, 1, 2, 6, 8})));
        // Test the reverseAnArray method and print the result
        System.out.println(Arrays.toString(reverseAnArray(new int[]{3, 4, 5, 1, 2, 6, 8})));
    }

    /**
     * Reverses the given array using an additional array.
     * @param arr The integer array to reverse.
     * @return The reversed array.
     */
    public static int[] reverseArray(int[] arr) {
        // Create a new array to store the reversed elements
        int[] reversedArray = new int[arr.length];

        // Iterate through the original array in reverse order and copy elements to the reversed array
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index++] = arr[i];
        }

        // Return the reversed array
        return reversedArray;
    }

    /**
     * Reverses the given array in-place.
     * @param arr The integer array to reverse.
     * @return The reversed array.
     */
    public static int[] reverseAnArray(int[] arr) {
        // Iterate through the array from both ends and swap elements
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Return the reversed array
        return arr;
    }
}

  /*
        Reverse Array

        Create a method that will reverse the given array

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                [6, 2, 1, 5, 4, 3]

     */