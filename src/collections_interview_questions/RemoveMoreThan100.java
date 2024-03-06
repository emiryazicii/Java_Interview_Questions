package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * This class contains methods to remove all integers greater than 100 from a list of integers.
 */
public class RemoveMoreThan100 {


     //The main method to test the removeMoreThan100 and removeMoreThanHundred methods.
    public static void main(String[] args) {
        // Test removeMoreThan100 method
        System.out.println(removeMoreThan100(new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823))));

        System.out.println("--------------------------------------------------------------------------------------------------------");

        // Test removeMoreThanHundred method
        System.out.println(removeMoreThanHundred(new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823))));
    }

    /**
     * Removes all integers greater than 100 from the list and returns the modified list.
     * @param list The input list of integers.
     * @return The list with integers greater than 100 removed.
     */
    public static List<Integer> removeMoreThan100 (List<Integer> list){
        // Remove all integers greater than 100 from the list
        list.removeIf(p-> p > 100);
        return list;
    }

    /**
     * Removes all integers greater than 100 from the list and returns the modified list.
     * @param list The input list of integers.
     * @return The list with integers greater than 100 removed.
     */
    public static List<Integer> removeMoreThanHundred(List<Integer> list){
        // Use iterator to traverse the list and remove integers greater than 100
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() > 100){
                it.remove();
            }
        }
        return list;
    }
}

/*
        Remove More Than 100

        Create a method that will accept an Integer List and return the List with any value greater than 100 removed
            parameter: List<Integer>
            return: List<Integer>

        Ex:
            input:
                removeMoreThan100(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823)
            output:
                [50, 24, 29, -255, 87, 99]

     */