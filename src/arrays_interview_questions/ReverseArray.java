package arrays_interview_questions;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseArray(new int[]{3, 4, 5, 1, 2, 6,8})));
        System.out.println(Arrays.toString(reverseAnArray(new int[]{3, 4, 5, 1, 2, 6,8})));

    }
    public static int[] reverseArray(int[] arr){

        int[] reversedArray = new int[arr.length];

        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index++] = arr[i];
        }
        return reversedArray;
    }
    public static int[] reverseAnArray(int[] arr){

        for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
  /*
        Reverse Array

        Create a method that will reverse the given array

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                [6, 2, 1, 5, 4, 3]

     */