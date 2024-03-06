package collections_interview_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class contains a method to find the intersection of two sets.
 */
public class Intersection {


     //The main method to test the intersectionOfTheSets method.
    public static void main(String[] args) {
        // Create two sets
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 4, 1, 7, 2, 6, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6, 2, 5, 1, 8));

        // Find the intersection of the sets and print the result
        System.out.println(intersectionOfTheSets(set1, set2));
    }

    /**
     * Finds the intersection of the given Set objects.
     * The intersection is the shared elements between the Set objects.
     * @param set1 The first set.
     * @param set2 The second set.
     * @return The set containing the intersection elements.
     */
    public static Set<Integer> intersectionOfTheSets(Set<Integer> set1, Set<Integer> set2) {
        // Create a TreeSet to store the intersection elements in sorted order
        Set<Integer> intersection = new TreeSet<>();

        // Iterate through each element in set1
        for (int each : set1) {
            // If the element exists in set2, add it to the intersection set
            if (set2.contains(each)) {
                intersection.add(each);
            }
        }
        // Return the set containing the intersection elements
        return intersection;
    }
}

 /*
        Intersection

        Create a method that will return the intersection of the given Set objects.The intersection is the shared elements between the Set objects
            parameter: Set<Integer> set1, Set<Integer> set2
            return: Set<Integer>

        Ex:
            input:
                 set1: [3, 4, 1, 7, 2, 6, 5]
                 set2: [6, 2, 5, 1, 8]
            output:
                 [1, 2, 5, 6]
     */
