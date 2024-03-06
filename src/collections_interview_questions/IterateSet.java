package collections_interview_questions;

import java.util.*;

/**
 * This class contains methods to iterate through a Set and print its values.
 */
public class IterateSet {


     //The main method to test various methods of iterating through a Set.
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> set = new LinkedHashSet<>(Arrays.asList("java", "selenium", "sql", "api"));

        // Iterate using forEach method with method reference
        set.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------");

        // Iterate using forEach method with lambda expression
        set.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        // Iterate using enhanced for loop
        for (String each : set) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------------------------");

        // Iterate using Iterator
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----------------------------------------------------------------------");
    }
}

 /*
        Iterate a Set

        Create a program to iterate through a Set and print the values.The main focus here is to check your understanding of collection types and how Set is different from others.

        Ex:
            input:
                 set: ["java", "selenium", "sql", "api"]
            output:
                java
                selenium
                sql
                api
     */