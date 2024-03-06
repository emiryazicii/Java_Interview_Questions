package arrays_interview_questions;

import java.util.*;

/**
 * This class contains methods to remove duplicate elements from an integer array.
 */
public class RemoveDuplicates {


     //The main method to test the removeDuplicatesElements and removeDuplicatesFromArray methods.
    public static void main(String[] args) {
        // Test the removeDuplicatesElements method and print the result
        System.out.println(Arrays.toString(removeDuplicatesElements(new int[]{3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3})));
        // Test the removeDuplicatesFromArray method and print the result
        System.out.println(Arrays.toString(removeDuplicatesFromArray(new int[]{3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3})));
    }

    /**
     * Removes duplicate elements from the array using ArrayList.
     * @param arr The integer array to remove duplicates from.
     * @return The array with duplicate elements removed.
     */
    public static int[] removeDuplicatesElements(int[] arr) {
        // Create a new ArrayList to store unique elements
        ArrayList<Integer> newList = new ArrayList<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Add the element to the newList if it's not already present
            if(!newList.contains(arr[i])){
                newList.add(arr[i]);
            }
        }

        // Convert the ArrayList to an array
        int[] newArr = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            newArr[i] = newList.get(i);
        }

        // Return the array with duplicate elements removed
        return newArr;
    }

    /**
     * Removes duplicate elements from the array using LinkedHashSet.
     * @param arr The integer array to remove duplicates from.
     * @return The array with duplicate elements removed.
     */
    public static int[] removeDuplicatesFromArray(int[] arr) {
        // Create a new LinkedHashSet to store unique elements
        Set<Integer> newSet = new LinkedHashSet<>();

        // Iterate through each element in the array and add it to the set
        for (int each : arr) {
            newSet.add(each);
        }

        // Convert the set to an array
        int[] newArr = new int[newSet.size()];
        int index = 0;
        for (Integer each : newSet) {
            newArr[index++] = each;
        }

        // Return the array with duplicate elements removed
        return newArr;
    }
}

 /*
        Remove Duplicates

        Create a method that will remove the duplicate values from an int array
        The returning array should only have one occurrence of each number

        Ex:
            Input:
                [3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3]
            Output:
                [3, 4, 5, 1, 2, 6]

     */