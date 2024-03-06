package numbers_interview_questions;

import java.math.BigInteger;

/**
 * This class provides methods to calculate the factorial of a given number.
 */
public class Factorial {


     //Main method to test factorial calculation methods.
    public static void main(String[] args) {
        // Test different factorial calculation methods
        System.out.println(factorial(2));
        System.out.println(factorial2(20));
        System.out.println(factorial3(150));
        System.out.println(factorial4(0));
        System.out.println(factorial5(4));
        System.out.println(factorial5(0));
        System.out.println(factorial5(-1));
    }

    /**
     * Method to calculate the factorial of a number using int data type.
     *
     * @param number The input number.
     * @return The factorial of the input number.
     */
    public static int factorial(int number) {
        // Check if the input number is negative
        if (number < 0) {
            System.err.println("Number can't be negative");
            System.exit(1);
        }

        int factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Method to calculate the factorial of a number using long data type.
     *
     * @param number The input number.
     * @return The factorial of the input number.
     */
    public static long factorial2(int number) {
        // Check if the input number is negative
        if (number < 0) {
            System.err.println("Number can't be negative");
            System.exit(1);
        }

        // If the input number is 0, return 1
        if (number == 0) {
            return 1;
        }

        long factorial = 1;

        // Calculate factorial using a for loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Method to calculate the factorial of a number using BigInteger data type.
     *
     * @param number The input number.
     * @return The factorial of the input number.
     */
    public static BigInteger factorial3(int number) {
        // Check if the input number is negative
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }

        // If the input number is 0, return BigInteger.ONE
        if (number == 0) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;

        // Calculate factorial using BigInteger and a for loop
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    /**
     * Method to calculate the factorial of a number using int data type with while loop.
     *
     * @param n The input number.
     * @return The factorial of the input number.
     */
    public static int factorial4(int n) {
        // Check if the input number is negative
        if (n < 0) {
            System.err.println("Number can't be negative");
            System.exit(1);
        }

        int result = 1;

        // Calculate factorial using a while loop
        while (n > 1) {
            result *= n--;
        }
        return result;
    }

    /**
     * Method to calculate the factorial of a number using recursion.
     *
     * @param n The input number.
     * @return The factorial of the input number.
     */
    public static int factorial5(int n) {
        // Check if the input number is negative
        if (n < 0) {
            System.err.println("Number can't be negative");
            System.exit(1);
        }

        // Base case: if n is 0 or 1, return 1
        if (n == 1 || n == 0) {
            return 1;
        }

        // Recursive call to calculate factorial
        return n * factorial5(n - 1);
    }
}

    /*
      Factorial Number

      Create a method that will accept an int number and return the factorial of that number.
          parameter: int
          return: int

      A factorial number is the product of all the positive integers that come before that number. In math the factional is represented with an exclamation point

      -> 5 factional is: 5!

      Ex:
          input: 5
          output: 120

          -> all the positive numbers from the number, 5, are multiplied
              5! = 5 * 4 * 3 * 2 * 1
      Test data:
          5 -> 120
          6 -> 720
          8 -> 40320
   */
