package collections_interview_questions;

import java.util.*;

public class IterateSet {

    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>(Arrays.asList("java", "selenium", "sql", "api"));

        set.forEach(System.out::println);

        System.out.println("--------------------------------------------------------------");

        set.forEach(p -> System.out.println(p));

        System.out.println("----------------------------------------------------------------");

        for (String each : set) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------------------------------");

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