package numbers_interview_questions;

/**
 * This class provides a method to calculate the sum of all digits until there is only one digit left.
 */
public class SumDigitsUntilOne {


     //Main method to test the sumDigitsUntilOne method.
    public static void main(String[] args) {
        System.out.println(sumDigitsUntilOne(45659));
        System.out.println(sumDigitsUntilOne(3244));
        System.out.println(sumDigitsUntilOne(24536));
        System.out.println(sumDigitsUntilOne(45));
    }

    /**
     * Method to calculate the sum of all digits until there is only one digit left.
     *
     * @param n The input integer.
     * @return The final single-digit sum.
     */
    public static int sumDigitsUntilOne(int n) {
        // Continue the process until n has only one digit
        while (n / 10 != 0) {
            int sum = 0;
            // Calculate sum of digits of n
            while (n != 0) {
                sum += n % 10; // Add the last digit to sum
                n /= 10; // Remove the last digit
            }
            n = sum; // Assign sum as the new value of n
        }
        return n; // Return the final single-digit sum
    }
}

    /*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left. The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2

     */