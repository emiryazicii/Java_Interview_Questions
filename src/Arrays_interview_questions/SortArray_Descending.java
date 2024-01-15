package Arrays_interview_questions;

import java.util.Arrays;

public class SortArray_Descending {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending(new int[]{3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6})));

    }
    public static int[] sortDescending(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]< arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
   /*
        Sort Array Descending

        Create a method that will sort the given array in descending order (largest to smallest).

        DO NOT USE any built in methods

        Ex:
            Input:
                [3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6]
            Output:
                [8, 6, 6, 5, 4, 3, 3, 2, 1, 1, -1]

     */