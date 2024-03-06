package arrays_interview_questions;

/**
 * This class contains a method to find the minimum number in an integer array.
 */
public class MinNumberInArray {


     //The main method to test the displayMinNumber method.
    public static void main(String[] args) {
        // Test the displayMinNumber method and print the result
        System.out.println("Min number is :" + displayMinNumber(new int[]{3, -4, 1, 5, -1, -20}));
    }

    /**
     * Finds and returns the minimum number in the array.
     * @param arr The integer array to find the minimum number from.
     * @return The minimum number found in the array.
     */
    public static int displayMinNumber(int[] arr) {
        // Assume the first element in the array as the minimum number
        int minNumber = arr[0];

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is smaller than the current minNumber, update minNumber
            if(each < minNumber){
                minNumber = each;
            }
        }
        // Return the minimum number found
        return minNumber;
    }
}

  /*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */