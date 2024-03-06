package arrays_interview_questions;

/**
 * This class contains a method to find the first duplicate element in an integer array.
 */
public class FirstDuplicateElement {


     //The main method to test the findFirstDuplicateElement method.
    public static void main(String[] args) {
        // Test the findFirstDuplicateElement method and print the result
        System.out.println(findFirstDuplicateElement(new int[]{3, 5, 1, 3, -5, -1, 5}));
    }

    /**
     * Finds the first duplicate element in the given array.
     * @param arr The integer array to search for duplicates.
     * @return The first duplicate element found, or 0 if no duplicate is found.
     */
    public static int findFirstDuplicateElement(int[] arr) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Compare the current element with the rest of the elements in the array
            for (int j = i + 1; j < arr.length; j++) {
                // If a duplicate is found, return the duplicate element
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        // If no duplicate is found, return 0
        return 0;
    }
}

  /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */