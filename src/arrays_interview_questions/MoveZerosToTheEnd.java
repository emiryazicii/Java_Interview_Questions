package arrays_interview_questions;

import java.util.Arrays;

/**
 * This class contains a method to move all zeros in an integer array to the end.
 */
public class MoveZerosToTheEnd {


     //The main method to test the moveZeros method.
    public static void main(String[] args) {
        // Test the moveZeros method and print the result
        System.out.println(Arrays.toString(moveZeros(new int[]{5, 0, 2, 0, 0, 1, 0, 23})));
    }

    /**
     * Moves all zeros in the array to the end.
     * @param arr The integer array to move zeros in.
     * @return The array with zeros moved to the end.
     */
    public static int[] moveZeros(int[] arr) {
        // Create a new array to store the result
        int[] newArr = new int[arr.length];

        // Initialize an index to keep track of the non-zero elements in the new array
        int index = 0;

        // Iterate through each element in the array
        for (int each : arr) {
            // If the current element is non-zero, add it to the new array and increment the index
            if(each != 0){
                newArr[index++] = each;
            }
        }
        // Return the new array with zeros moved to the end
        return newArr;
    }
}

   /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */