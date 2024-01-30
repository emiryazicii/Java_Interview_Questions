package arrays_interview_questions;

public class TriplesArray {

    public static void main(String[] args) {


        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));

    }
    public static boolean noTriples(int[] arr){

        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i] == arr[i+1] && arr[i+1] == arr[i+2]){
                return false;
            }
        }
        return true;
    }
}
    /*
        Triples Array

        Create a method that will determine if the array has a triple or not. A triple is when an element is repeat 3 times in a row. If any number is repeat 3 times in a row return false. If the array does not have any triples return true

        Ex:
            noTriples([1, 1, 2, 2, 1]) → true
            noTriples([1, 1, 2, 2, 2, 1]) → false
            noTriples([1, 1, 1, 2, 2, 2, 1]) → false

     */