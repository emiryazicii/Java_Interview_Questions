package Arrays_interview_questions;

public class FirstDuplicateElement {

    public static void main(String[] args) {

        System.out.println(findFirstDuplicateElement(new int[]{3, 5, 1, 3,-5, -1, 5}));

    }
    public static int findFirstDuplicateElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
}
  /*
        First Duplicate Element

        Create a method that will find and return the first duplicate element
            parameter: int[]
            return: int
                if no duplicate elements are found return 0

        A duplicate element is when the number can be found multiple times in the array

        Ex:
            input:
                findDup(3, 5, 1, 5, -1, 5, 3)
            output:
                3

                -> 3 is the first duplicate found
     */