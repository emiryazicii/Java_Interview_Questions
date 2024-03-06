package arrays_interview_questions;

/**
 * This class contains a method to find the second largest number in an integer array.
 */
public class SecondLargestNumberInArray {


     //The main method to test the secondLargestNumber method.
    public static void main(String[] args) {
        // Test the secondLargestNumber method and print the result
        System.out.println("Second largest number is : " + secondLargestNumber(new int[]{20, 4, 5, 1, 2, 6, 9}));
    }

    /**
     * Finds the second largest number in the array.
     * @param arr The integer array to find the second largest number from.
     * @return The second largest number found.
     */
    public static int secondLargestNumber(int[] arr) {
        // Initialize variables to store the maximum and second maximum numbers
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is greater than the current max, update both max and secondMax
            if (each > max) {
                secondMax = max;
                max = each;
            }
            // If the current element is greater than the current secondMax and not equal to max, update secondMax
            else if (each > secondMax && each != max) {
                secondMax = each;
            }
        }
        // Return the second largest number found
        return secondMax;
    }
}

  /*
        Second largest Number

        Create a method that finds the second largest number in the given array. The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */