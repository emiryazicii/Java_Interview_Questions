package arrays_interview_questions;

/**
 * This class contains a method to find pairs of numbers in an integer array that add up to a given sum.
 */
public class AddUpToSum {

    // The main method to test the addUpToSum method.
    public static void main(String[] args) {
        addUpToSum(new int[]{8, 7, 2, 5, 3, 1}, 10);
    }

    /**
     * Finds pairs of numbers from the given array that add up to the specified sum.
     * @param arr The integer array to search for pairs.
     * @param sumNumbers The target sum to find pairs for.
     */
    public static void addUpToSum(int[] arr, int sumNumbers) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Loop through each element after the current element
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the sum of current element and next element equals the target sum
                if (arr[i] + arr[j] == sumNumbers) {
                    // Print the pair of numbers that add up to the sum
                    System.out.println(arr[i] + " & " + arr[j]);
                }
            }
        }
    }
}

  /*
        Add Up to Sum

        Given an int array and an int representing the sum number, create a program that can find the pair of numbers from the array that add up to the sum number

        Add the numbers from the array to determine the possible pairs that add up to the sum

        Ex:
            array = [8, 7, 2, 5, 3, 1]
            sum = 10

            output:
                8 & 2
                7 & 3
     */
