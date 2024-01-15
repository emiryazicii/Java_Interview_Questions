package Arrays_interview_questions;

import java.util.Arrays;

public class SumLeftAndRight {

    public static void main(String[] args) {
        System.out.println("Element at the middle of sums is: " + theElementAtMiddleOfSums(new int[]{4, 9, 1, 3, 6, 4}));
        System.out.println("Element at the middle of sums is: " + theElementAtMiddleOfSums(new int[]{1, 2, 3, 4, 100, 10}));
        System.out.println("Element at the middle of sums is: " + sumLeftRight(new int[]{4, 9, 1, 3, 6, 4}));
        System.out.println("Element at the middle of sums is: " + sumLeftRight(new int[]{1, 2, 3, 4, 100, 10}));
        System.out.println("Element at the middle of sums is: " + sumLeftAndRight(new int[]{4, 9, 1, 3, 6, 4}));
        System.out.println("Element at the middle of sums is: " + sumLeftAndRight(new int[]{1, 2, 3, 4, 100, 10}));
        System.out.println("Element at the middle of sums is: " + elementInTheMiddleOfSums(new int[]{4, 9, 1, 3, 6, 4}));
        System.out.println("Element at the middle of sums is: " + elementInTheMiddleOfSums(new int[]{1, 2, 3, 4, 100, 10}));
    }

    public static int theElementAtMiddleOfSums(int[] arr) {

        int sumLeft = 0;
        int sumTotal = 0;
        int element = 0;

        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
            if (sumLeft == sumTotal - sumLeft - arr[i + 1]) {
                element = arr[i + 1];
                break;
            }
        }
        return element;
    }

    public static int sumLeftRight(int[] arr) {

        int sumLeft = 0;
        int sumTotal = 0;
        int element = 0;

        for (int each : arr) {
            sumTotal += each;
        }
        for (int each : arr) {

            if (sumLeft == sumTotal - sumLeft - each) {
                element = each;
                break;
            }
            sumLeft += each;
        }
        return element;
    }

    public static int sumLeftAndRight(int[] arr) {

        int element = 0;

        for (int i = 1; i < arr.length - 1; i++) {

            int left = 0;
            int right = 0;

            for (int j = 0; j < arr.length; j++) {

                if (j < i) {
                    left += arr[j];
                } else if (j > i) {
                    right += arr[j];
                }
            }
            if (left == right) {
                element = arr[i];
            }
        }
        return element;
    }

    public static int elementInTheMiddleOfSums(int[] arr){

        int element = 0;

        for (int i = 1; i < arr.length-1; i++) {

            int[] left = Arrays.copyOfRange(arr,0,i);
            int[] right = Arrays.copyOfRange(arr, i+1,arr.length);

            if(Arrays.stream(left).sum() == Arrays.stream(right).sum()){
                element = arr[i];
            }
        }
        return element;
    }
}

 /*
        Sum Left and Right

        Create a method that will return an element from that array. The element it should return is the middle point where the sum of elements on its left and equal to the sum of elements on its right.

        Assume there is always a single valid element in the array values

        Ex:
            Input:
                [4, 9, 1, 3, 6, 4]
            Output:
                1

                -> 1 is the element returned because the left sum = 4 + 9
                is equal to the right sum = 3 + 6 + 4

        Ex:
            Input:
                [1, 2, 3, 4, 100, 10]
            Output:
                100

                -> 100 is the element returned because the left sum = 1 + 2 + 3 + 4
                is equal to the right sum = 10

     */