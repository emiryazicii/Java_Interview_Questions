package Numbers_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LovelyNumbers {

    public static void main(String[] args) {

        System.out.println(countLovelyNumbers(1000, 1000));
        System.out.println(lovelyNumbers(1,111));

    }

    public static int countLovelyNumbers(int lowerBound, int upperBound) {

        int countLovelyNumbers = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            String str = String.valueOf(i);
            int countSameDigits = 0;
            for (int j = 0; j < str.length(); j++) {
                for (int k = j + 1; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        countSameDigits++;
                    }
                }
            }
            if (countSameDigits < 3) {
                countLovelyNumbers++;
            }
        }
        return countLovelyNumbers;
    }

    public static int lovelyNumbers(int loverBound, int upperBound) {

        int count = 0;

        for (int i = loverBound; i <= upperBound; i++) {

            List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(i).split("")));

            int sizeBefore = list.size();
            list.removeIf(p -> Collections.frequency(list, p) >= 3);

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