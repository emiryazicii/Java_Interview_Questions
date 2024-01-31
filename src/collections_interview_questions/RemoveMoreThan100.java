package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveMoreThan100 {

    public static void main(String[] args) {

        System.out.println(removeMoreThan100(new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823))));

        System.out.println("--------------------------------------------------------------------------------------------------------");

        System.out.println(removeMoreThanHundred(new ArrayList<>(Arrays.asList(1000, 50, 24, 200, 124, 29, -255, 981, 102, 87, 99, 1823))));

    }

    public static List<Integer> removeMoreThan100 (List<Integer> list){

        list.removeIf(p-> p > 100);

        return list;

    }

    public static List<Integer> removeMoreThanHundred(List<Integer> list){

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