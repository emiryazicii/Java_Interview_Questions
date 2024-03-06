package arrays_interview_questions;

import java.util.Arrays;

/**
 * This class contains methods to concatenate two integer arrays into one array.
 */
public class ConcatArrays {


     //The main method to test the concatArrays method.
    public static void main(String[] args) {
        // Test the concatArrays method and print the result
        System.out.println(Arrays.toString(concatArrays(new int[]{1, 4, 5}, new int[]{8, 12, 5, 9})));
        // Test the concat method and print the result
        System.out.println(Arrays.toString(concat(new int[]{1, 4, 5}, new int[]{8, 12, 5, 9})));
    }

    /**
     * Concatenates two integer arrays into one array.
     * @param arr1 The first integer array.
     * @param arr2 The second integer array.
     * @return The concatenated array.
     */
    public static int[] concatArrays(int[] arr1, int[] arr2){

        // Create a new array to hold the concatenated elements
        int[] newArray = new int[arr1.length + arr2.length];

        // Copy elements from arr1 to newArray
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }

        // Copy elements from arr2 to newArray after arr1
        for (int i = 0, j = arr1.length; i < arr2.length; i++, j++) {
            newArray[j] = arr2[i];
        }

        return newArray;
    }

    /**
     * Concatenates two integer arrays into one array.
     * @param arr1 The first integer array.
     * @param arr2 The second integer array.
     * @return The concatenated array.
     */
    public static int[] concat(int[] arr1, int[] arr2){

        // Create a new array to hold the concatenated elements
        int[] mergedArray = new int[arr1.length + arr2.length];

        // Merge elements from arr1 and arr2 into mergedArray
        for (int i = 0, j = 0; i < mergedArray.length; i++) {
            // If i is within the range of arr1, copy elements from arr1
            if (i < arr1.length) {
                mergedArray[i] = arr1[i];
            } else {
                // Otherwise, copy elements from arr2
                mergedArray[i] = arr2[j++];
            }
        }
        return mergedArray;
    }
}

  /*
        Concat Arrays

        Create a method that will take two int arrays and concat them into one array. Concat the arrays by combining them into one array

        Ex:
            Input:
                [1, 4, 5], [8, 12, 5, 9]
            Output:
                [1, 4, 5, 8, 12, 5, 9]
     */
