package Arrays_interview_questions;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeros(new int[]{5, 0, 2, 0, 0, 1, 0, 23})));

    }
    public static int[] moveZeros(int[] arr){

        int[] newArr = new int[arr.length];

        int index = 0;

        for (int each : arr) {
            if(each != 0){
                newArr[index++] = each;
            }
        }
        return newArr;
    }
}
   /*
        Move Zeros to End

        Create a method that will accept an int array and return an array with all the zeros moved to the end

        Ex:
            Input:
                [5, 0, 2, 0, 0, 1, 0, 23]
            Output:
               [5, 2, 1, 23, 0, 0, 0, 0]
     */