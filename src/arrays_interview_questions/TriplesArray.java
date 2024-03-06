package arrays_interview_questions;

/**
 * This class contains a method to determine if the array has a triple or not.
 */
public class TriplesArray {


     //The main method to test the noTriples method.
    public static void main(String[] args) {
        // Test the noTriples method and print the result
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }

    /**
     * Determines if the array has a triple or not. A triple is when an element is repeated 3 times in a row.
     * @param arr The integer array to check for triples.
     * @return True if the array does not have any triples, false otherwise.
     */
    public static boolean noTriples(int[] arr) {
        // Iterate through the array and check if there are three consecutive equal elements
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] && arr[i + 1] == arr[i + 2]) {
                return false;
            }
        }
        return true;
    }
}

    /*
        Triples Array

        Create a method that will determine if the array has a triple or not. A triple is when an element is repeat 3 times in a row. If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */