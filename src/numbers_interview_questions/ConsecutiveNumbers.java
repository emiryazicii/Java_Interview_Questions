package numbers_interview_questions;

/**
 * This class provides methods to display consecutive numbers with certain replacements based on divisibility.
 */
public class ConsecutiveNumbers {


     //Main method to test consecutive numbers display methods.
     static void main(String[] args) {
        displayConsecutiveNumbers(16);
        displayConsecutiveNumbers2(16);
    }

    /**
     * Method to display consecutive numbers from 1 to n with replacements based on divisibility.
     *
     * @param n The upper limit of consecutive numbers.
     */
    public static void displayConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            // Check divisibility by different numbers and print corresponding strings
            if (i % 30 == 0) {
                System.out.println("CodilityTestCoders"); // If divisible by 30
            } else if (i % 15 == 0) {
                System.out.println("TestCoders"); // If divisible by 15
            } else if (i % 10 == 0) {
                System.out.println("CodilityCoders"); // If divisible by 10
            } else if (i % 6 == 0) {
                System.out.println("CodilityTest"); // If divisible by 6
            } else if (i % 5 == 0) {
                System.out.println("Coders"); // If divisible by 5
            } else if (i % 3 == 0) {
                System.out.println("Test"); // If divisible by 3
            } else if (i % 2 == 0) {
                System.out.println("Codility"); // If divisible by 2
            } else {
                System.out.println(i); // Print the number itself if not divisible by any specified number
            }
        }
    }

    /**
     * Method to display consecutive numbers from 1 to n with replacements based on divisibility.
     *
     * @param n The upper limit of consecutive numbers.
     */
    public static void displayConsecutiveNumbers2(int n) {
        for (int i = 1; i <= n; i++) {
            String result = "";
            // Build the replacement string based on divisibility
            if (i % 2 == 0) {
                result += "Codility"; // Append "Codility" if divisible by 2
            }
            if (i % 3 == 0) {
                result += "Test"; // Append "Test" if divisible by 3
            }
            if (i % 5 == 0) {
                result += "Coders"; // Append "Coders" if divisible by 5
            }
            // If the replacement string is empty, print the number itself, otherwise print the replacement string
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}

  /*
        Consecutive Numbers

        Create a method to print consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers it should be replaced by a concatenation of the respective words.
        The given N value will be a positive integer.

            parameter: int
            return: void

        Example of a number being divisible by 2 & 3:
            when the number is 6 the output should be CodilityTest because 6 is divisible by 2 and 3

        Example of a number being divisible by 2 & 5:
            when the number is 10 the output should be Codi1ityCoders because 10 is divisible by 2 and 5

        Ex:
            input: 16
            output:
                1
                Codility
                Test
                Codility
                Coders
                CodilityTest
                7
                Codility
                Test
                CodilityCoders
                11
                CodilityTest
                13
                Codility
                TestCoders
                Codility
     */