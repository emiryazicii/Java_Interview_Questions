package numbers_interview_questions;

/**
 * This class provides methods to calculate the Nth Fibonacci number.
 */
public class Fibonacci {


     //Main method to test Fibonacci calculation methods.
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        System.out.println(fibonacci2(8));
        System.out.println(fibonacci2(1));
    }

    /**
     * Method to calculate the Nth Fibonacci number iteratively.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The Nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        // Check if the input number is negative
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        // Base cases: 0th Fibonacci number is 0, 1st Fibonacci number is 1
        if (n == 0 || n == 1) {
            return n;
        }

        // Initialize variables to store current and next Fibonacci numbers
        int current = 0;
        int nextFib = 1;

        // Calculate Fibonacci number iteratively
        for (int i = 2; i <= n; i++) {
            int temp = current + nextFib;
            current = nextFib;
            nextFib = temp;
        }
        return nextFib;
    }

    /**
     * Method to calculate the Nth Fibonacci number recursively.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The Nth Fibonacci number.
     */
    public static int fibonacci2(int n) {
        // Check if the input number is negative
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        // Base cases: 0th Fibonacci number is 0, 1st Fibonacci number is 1
        if (n < 2) {
            return n;
        }

        // Calculate Fibonacci number recursively
        return fibonacci2(n - 2) + fibonacci2(n - 1);
    }
}

   /*
        Fibonacci

        Create a method that will give you the Nth Fibonacci number where N is the given int parameter.
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        parameter: int
        return: int

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */