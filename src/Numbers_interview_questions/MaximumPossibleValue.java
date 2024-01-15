package Numbers_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumPossibleValue {

    public static void main(String[] args) {

        System.out.println(biggestValue(2680));
        System.out.println(biggestValue(-999));
        System.out.println(biggestValue(798));


    }

    public static int biggestValue(int n) {

        boolean isPos = n >= 0;
        n = Math.abs(n);

        String strNum = Integer.toString(n);
        int i;

        for (i = 0; i < strNum.length(); i++) {
            char digit = strNum.charAt(i);
            if ((isPos && digit < '5') || (!isPos && digit > '5')) {
                break;
            }
        }
        strNum = strNum.substring(0, i) + '5' + strNum.substring(i);
        return Integer.parseInt(strNum) * (isPos ? 1 : -1);
    }

}
 /*
        Maximum Possible Value

        Create a method that will return the maximum possible value of the given number N by inserting the digit '5' somewhere in the integer.

        > bounds of N: -8,000 - 8,000

        Ex:
            Given N = 268, the function should return 5268
            Given N = 670, the function should return 6750
            Given N = 0, the function should return 50
            Given N = -999, the function should return -5999
     */