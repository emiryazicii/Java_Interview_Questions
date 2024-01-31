package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMoveAllZerosToTheEnd {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 0, 0, 1, 4, 0, 14, 1));

        System.out.println(moveZerosToEnd(list));

        System.out.println("---------------------------------------------------------");

        System.out.println(moveZeros(list));

    }

    public static List<Integer> moveZerosToEnd(List<Integer> list) {

        List<Integer> newList = new ArrayList<>();

        int zeroCount = 0;

        for (int each : list) {
            if (each != 0) {
                newList.add(each);
            } else {
                zeroCount++;
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            newList.add(0);
        }

        return newList;
    }

    public static List<Integer> moveZeros(List<Integer> list) {

        int sizeWithZeros = list.size();

        list.removeIf(p-> p.equals(0));

        int numberOfZeros = sizeWithZeros - list.size();

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