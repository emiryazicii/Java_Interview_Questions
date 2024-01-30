package arrays_interview_questions;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {

        System.out.println("Second largest number is : " + secondLargestNumber(new int[]{20, 4, 5, 1, 2, 6, 9}));
    }

    public static int secondLargestNumber(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int each : arr) {
            if (each > max) {
                secondMax = max;
                max = each;
            }else if (each > secondMax && each != max) {
                secondMax = each;
            }
        }
        return secondMax;
    }
}
  /*
        Second largest Number

        Create a method that finds the second largest number in the given array. The second largest must be different from the largest number.

        Ex:
            Input:
                [3, 4, 5, 1, 2, 6]
            Output:
                5

     */