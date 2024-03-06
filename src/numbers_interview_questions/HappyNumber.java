package numbers_interview_questions;

/**
 * This class provides a method to check if a given number is a happy or unhappy number.
 */
public class HappyNumber {


     //Main method to test the happyOrUnhappyNumber method.
    public static void main(String[] args) {
        System.out.println(happyOrUnhappyNumber(32));
        System.out.println(happyOrUnhappyNumber(42));
    }

    /**
     * Method to determine if a given number is a happy or unhappy number.
     *
     * @param n The number to be checked.
     * @return "Happy" if the number is happy, "Unhappy" otherwise.
     * @throws IllegalArgumentException if the input number is not positive.
     */
    public static String happyOrUnhappyNumber(int n) {
        // Check if the input number is positive
        if (n <= 0) {
            throw new IllegalArgumentException("Input should be positive integer");
        }

        // Continue the process until the number becomes 1 (happy) or 4 (unhappy)
        while (n != 1 && n != 4) {
            int sum = 0;
            // Calculate the sum of squares of digits
            while (n > 0) {
                int eachDigit = n % 10;
                sum += eachDigit * eachDigit;
                n /= 10;
            }
            n = sum; // Set n to the sum for the next iteration
        }
        // Return "Happy" if the number becomes 1, otherwise return "Unhappy"
        return n == 1 ? "Happy" : "Unhappy";
    }
}

    /*
        Happy Number

        Create a method that will check if the given number is a happy or an unhappy number

        A happy number is when the sum of its digits squared eventually result in 1.
        Hint: Read each digit of the number, square the number and take the number for the next number to be checked

        An unhappy number is when the numbers consistently end up as 4

        Ex:
            32
            Happy
            Breakdown:
                32 -> 3^2 + 2^2 = 9 + 4 = 13
                13 -> 1^2 + 3^3 = 1 + 9 = 10
                10 -> 1^2 + 0^2 = 1 + 0 = 1

        Ex:
            42
            Unhappy
            Breakdown:
                42 -> 4^2 + 2^2 = 16 + 4 = 20
                20 -> 2^2 + 0^2 = 4 + 0 = 4
     */