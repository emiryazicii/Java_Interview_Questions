package arrays_interview_questions;

public class MinNumberInArray {

    public static void main(String[] args) {

        System.out.println("Min number is :"+displayMinNumber(new int[]{3, -4, 1, 5, -1, -20}));

    }
    public static int displayMinNumber(int[] arr){

        int minNumber = arr[0];

        for (int each : arr) {
            if(each<minNumber){
                minNumber = each;
            }
        }
        return minNumber;
    }
}
  /*
        Min Number

        Create a method that will find and return the min number in an int array
            parameter: int[]
            return: int

        The min number is the smallest value in the array

        Ex:
            input:
                min(3, 5, 1, 5, -1, 5)
            output:
                -1
     */