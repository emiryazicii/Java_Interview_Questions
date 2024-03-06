package numbers_interview_questions;

/**
 * This class provides a method to calculate the sum of the digits of a given integer.
 */
public class SumOfDigits {


     //Main method to test the sumOfDigits method.
    public static void main(String[] args) {
        System.out.println(sumOfDigits(11111));
        System.out.println(sumOfDigits(54321));
        System.out.println(sumOfDigits(214));
    }

    /**
     * Method to calculate the sum of the digits of a given integer.
     *
     * @param n The input integer.
     * @return The sum of the digits of the input integer.
     */
    public static int sumOfDigits(int n) {
        int sum = 0;

        // Continue the process until n becomes 0
        while (n != 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit
        }
        return sum; // Return the sum of the digits
    }
}

      /*
        Sum Of Digits Of Integer

        Create a method that will calculate the sum of the number's digits. Do not use any String manipulation
            parameter: int
            return: int

        Ex:
            input: 123
            output: 6
            -> 1 + 2 + 3

        Test data:
            11111 -> 1 + 1 + 1 + 1 + 1 = 5
            54321 -> 5 + 4 + 3 + 2 + 1 = 15
            214 -> 2 + 1 + 4 = 7
     */