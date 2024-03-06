package arrays_interview_questions;

/**
 * This class contains a method to find the maximum number in an integer array.
 */
public class MaxNumberInArray {


     //The main method to test the displayMaxNumber method.
    public static void main(String[] args) {
        // Test the displayMaxNumber method and print the result
        System.out.println("Max number is " + displayMaxNumber(new int[]{3, 5, 1,10, -1, 5}));
    }

    /**
     * Finds and returns the maximum number in the array.
     * @param arr The integer array to find the maximum number from.
     * @return The maximum number found in the array.
     */
    public static int displayMaxNumber(int[] arr) {
        // Assume the first element in the array as the maximum number
        int maxNumber = arr[0];

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is greater than the current maxNumber, update maxNumber
            if(each > maxNumber){
                maxNumber = each;
            }
        }
        // Return the maximum number found
        return maxNumber;
    }
}

   /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */