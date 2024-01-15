package Arrays_interview_questions;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeDuplicatesElements(new int[]{3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3})));
        System.out.println(Arrays.toString(removeDuplicatesFromArray(new int[]{3, 3, 4, 5, 1, 2, 6, 2, 5, 4, 2, 1, 3})));

    }
    public static int[] removeDuplicatesElements(int[] arr){

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!newList.contains(arr[i])){
                newList.add(arr[i]);
            }
        }
        int[] newArr = new int[newList.size()];

        for (int i = 0; i < newList.size(); i++) {
            newArr[i] = newList.get(i);
        }
        return newArr;
    }

    public static int[] removeDuplicatesFromArray(int[] arr){

        Set<Integer> newSet = new LinkedHashSet<>();

        for (int each : arr) {
            newSet.add(each);
        }
        int[] newArr = new int[newSet.size()];
        int index = 0;

        for (Integer each : newSet) {
            newArr[index++] = each;
        }
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