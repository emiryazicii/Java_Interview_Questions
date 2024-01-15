package Arrays_interview_questions;

public class MaxNumberInArray {

    public static void main(String[] args) {

        System.out.println("Max number is "+displayMaxNumber(new int[]{3, 5, 1,10, -1, 5}));

    }
    public static int displayMaxNumber(int[] arr){

        int maxNumber = arr[0];

        for (int each : arr) {
            if(each > maxNumber){
                maxNumber = each;
            }
        }
        return maxNumber;
    }
}
   /*
        Max Number

        Create a method that will find and return the max number in an int array
            parameter: int[]
            return: int

        The max number is the biggest value in the array

        Ex:
            input:
                max(3, 5, 1, 5, -1, 5)
            output:
                5
     */