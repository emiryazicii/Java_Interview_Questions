package numbers_interview_questions;

/**
 * This class provides methods to reverse a given integer.
 */
public class ReverseInteger {


     //Main method to test reverseIntegerNumber methods.
    public static void main(String[] args) {
        System.out.println(reverseIntegerNumber(1234));
        System.out.println(reverseIntegerNumber2(1234));
    }

    /**
     * Method to reverse a given integer by converting it to a string and reversing the characters.
     *
     * @param n The integer to be reversed.
     * @return The reversed integer.
     */
    public static int reverseIntegerNumber(int n) {
        String numStr = String.valueOf(n);
        String reversedNum = "";

        // Iterate through each digit of the number in reverse order
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reversedNum += numStr.charAt(i); // Append each digit to the reversed number string
        }
        return Integer.parseInt(reversedNum); // Convert the reversed number string back to integer
    }

    /**
     * Method to reverse a given integer without using strings.
     *
     * @param n The integer to be reversed.
     * @return The reversed integer.
     */
    public static int reverseIntegerNumber2(int n) {
        int reversedNum = 0;

        // Iterate through each digit of the number
        while (n != 0) {
            int digit = n % 10; // Extract the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            n /= 10; // Remove the last digit from the original number
        }
        return reversedNum;
    }
}

        /*
        Reverse Integer

        Create a method to reverse the given number
            parameter: int
            return: int

        Reverse using only numbers, no Strings

        Assume the given number is a positive integer

        Ex:
            input: 1234
            output: 4321
     */
