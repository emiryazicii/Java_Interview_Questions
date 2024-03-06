package numbers_interview_questions;

/**
 * This class provides a method to return the maximum possible value of a given number
 * by inserting the digit '5' somewhere in the integer.
 */
public class MaximumPossibleValue {


     //Main method to test the biggestValue method.
    public static void main(String[] args) {
        System.out.println(biggestValue(2680));
        System.out.println(biggestValue(-999));
        System.out.println(biggestValue(798));
    }

    /**
     * Method to return the maximum possible value of a given number
     * by inserting the digit '5' somewhere in the integer.
     *
     * @param n The given number.
     * @return The maximum possible value after inserting '5'.
     */
    public static int biggestValue(int n) {
        boolean isPositive = n >= 0;
        n = Math.abs(n);

        // Convert the number to a string
        String strNum = Integer.toString(n);
        int i;

        // Find the position to insert '5'
        for (i = 0; i < strNum.length(); i++) {
            char digit = strNum.charAt(i);
            if ((isPositive && digit < '5') || (!isPositive && digit > '5')) {
                break;
            }
        }

        // Insert '5' at the appropriate position and convert back to integer
        strNum = strNum.substring(0, i) + '5' + strNum.substring(i);
        return Integer.parseInt(strNum) * (isPositive ? 1 : -1);
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