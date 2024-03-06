package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * This class contains methods to remove all occurrences of the name "Ahmed" from a list of names.
 */
public class RemoveAhmed {


     //The main method to test the removeAhmed and withoutAhmed methods.
    public static void main(String[] args) {
        // Test removeAhmed method
        System.out.println(removeAhmed(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"))));

        System.out.println("-------------------------------------------------------------------------------");

        // Test withoutAhmed method
        System.out.println(withoutAhmed(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"))));
    }

    /**
     * Removes all occurrences of the name "Ahmed" from the list and returns the modified list.
     * @param list The input list of names.
     * @return The list with all occurrences of "Ahmed" removed.
     */
    public static List<String> removeAhmed(List<String> list){
        // Remove all occurrences of "Ahmed" from the list
        list.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        return list;
    }

    /**
     * Removes all occurrences of the name "Ahmed" from the list and returns the modified list.
     * @param list The input list of names.
     * @return The list with all occurrences of "Ahmed" removed.
     */
    public static List<String> withoutAhmed(List<String> list){
        // Use iterator to traverse the list and remove "Ahmed" when found
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }
        return list;
    }
}

  /*
        Remove Ahmed

        Create a method that will accept a List of names and return the List with all the Ahmed names removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removeAhmed("Ahmed", "John", "Eric", "Ahmed")
            output:
                [John, Eric]

     */