package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class contains methods to move all zero elements to the end of a List.
 */
public class ListMoveAllZerosToTheEnd {


     //The main method to test the moveZerosToEnd and moveZeros methods.
    public static void main(String[] args) {
        // Create a List with some elements including zeros
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 4, 0, 14, 1));

        // Test moveZerosToEnd method
        System.out.println(moveZerosToEnd(list));

        System.out.println("---------------------------------------------------------");

        // Test moveZeros method
        System.out.println(moveZeros(list));
    }

    /**
     * Moves all zero elements to the end of the list and returns the modified list.
     * @param list The input list of integers.
     * @return The list with all zero elements moved to the end.
     */
    public static List<Integer> moveZerosToEnd(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        int zeroCount = 0;

        // Iterate through the list
        for (int each : list) {
            if (each != 0) {
                newList.add(each);
            } else {
                zeroCount++;
            }
        }

        // Add zeros to the end of the list
        for (int i = 0; i < zeroCount; i++) {
            newList.add(0);
        }

        return newList;
    }

    /**
     * Moves all zero elements to the end of the list and returns the modified list.
     * @param list The input list of integers.
     * @return The list with all zero elements moved to the end.
     */
    public static List<Integer> moveZeros(List<Integer> list) {
        int sizeWithZeros = list.size();

        // Remove all zeros from the list
        list.removeIf(p-> p.equals(0));

        int numberOfZeros = sizeWithZeros - list.size();

        // Add zeros to the end of the list
        for (int i = 0 ; i < numberOfZeros ; i++){
            list.add(0);
        }
        return list;
    }
}

 /*
        Move All Zeros To The End

        Create a method that will accept an Integer List and return the List with all the zero elements moved to the end
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                moveZeros(5, 0, 0, 1, 4, 0, 14, 1)
            output:
                [5, 1, 4, 14, 1, 0, 0, 0]

     */