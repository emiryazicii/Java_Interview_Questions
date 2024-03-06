package numbers_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class provides methods to count lovely numbers within a given range.
 */
public class LovelyNumbers {


     //Main method to test lovely number counting methods.
    public static void main(String[] args) {
        // Test countLovelyNumbers method
        System.out.println(countLovelyNumbers(1000, 1000));
        // Test lovelyNumbers method
        System.out.println(lovelyNumbers(1, 111));
    }

    /**
     * Method to count lovely numbers within a given range using nested loops.
     *
     * @param lowerBound The lower bound of the range.
     * @param upperBound The upper bound of the range.
     * @return The count of lovely numbers within the range.
     */
    public static int countLovelyNumbers(int lowerBound, int upperBound) {
        int countLovelyNumbers = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            String str = String.valueOf(i);
            int countSameDigits = 0;
            // Loop through each digit of the number
            for (int j = 0; j < str.length(); j++) {
                // Compare each digit with other digits in the number
                for (int k = j + 1; k < str.length(); k++) {
                    // If two digits are same, increment the count
                    if (str.charAt(j) == str.charAt(k)) {
                        countSameDigits++;
                    }
                }
            }
            // If the count of same digits is less than 3, increment the lovely number count
            if (countSameDigits < 3) {
                countLovelyNumbers++;
            }
        }
        return countLovelyNumbers;
    }

    /**
     * Method to count lovely numbers within a given range using collections.
     *
     * @param lowerBound The lower bound of the range.
     * @param upperBound The upper bound of the range.
     * @return The count of lovely numbers within the range.
     */
    public static int lovelyNumbers(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(i).split("")));
            int sizeBefore = list.size();
            // Remove digits that occur more than 2 times
            list.removeIf(p -> Collections.frequency(list, p) >= 3);
            // If the size of the list remains the same, increment the lovely number count
            if (sizeBefore == list.size()) {
                count++;
            }
        }
        return count;
    }
}

  /*
        Lovely Number

        Create a method that will count the lovely numbers with the given range. The parameters a and b are defined as the lower and upper bounds.
        A number is lovely if it contains fewer than three instances of any distinct digit

        Example of lovely numbers: 0, 100, 1232 and 9922
        Example of non-lovely numbers: 1000 (contains three copies of digit '0'), 33533 (contains four copies of digit '3').

        parameter: int, int
            A and B will be within the range: 0 - 100,000
        return: int

        Ex:
            Given A = 0, B = 0, your function should return 1, because o is
        lovely.

            Given A = 1, B = 111, your function should return 110, because
        the only integer in the range [1..111] that is not lovely is 111.

            Given A = 100000, B = 100000, your function should return 0,
        because 100000 is not lovely.
     */