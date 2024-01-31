package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    public static void main(String[] args) {

        System.out.println(removeAhmed(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"))));

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(withoutAhmed(new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"))));

    }

    public static List<String> removeAhmed(List<String> list){

        list.removeIf(p-> p.equalsIgnoreCase("ahmed"));

        return list;

    }

    public static List<String> withoutAhmed(List<String> list){

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