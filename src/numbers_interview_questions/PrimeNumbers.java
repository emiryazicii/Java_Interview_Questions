package numbers_interview_questions;

/**
 * This class provides methods to check whether a given number is prime or not.
 */
public class PrimeNumbers {


     //Main method to test prime number checking methods.
    public static void main(String[] args) {
        // Test isPrime method
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(25));

        // Test isPrime2 method
        System.out.println(isPrime2(7));
        System.out.println(isPrime2(6));
        System.out.println(isPrime2(2));
        System.out.println(isPrime2(3));
        System.out.println(isPrime2(4));
        System.out.println(isPrime2(25));
    }

    /**
     * Method to check if a given number is prime using a simple algorithm.
     *
     * @param n The number to check for primality.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        // Check divisibility by numbers up to half of n
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by i, it's not prime
            }
        }
        return true; // If no divisors found, n is prime
    }

    /**
     * Method to check if a given number is prime using a more optimized algorithm.
     *
     * @param n The number to check for primality.
     * @return True if the number is prime, false otherwise.
     */
    public static boolean isPrime2(int n) {
        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n); // Calculate square root of n
        // Check divisibility by numbers up to square root of n
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by i, it's not prime
            }
        }
        return true; // If no divisors found, n is prime
    }
}

  /*
        Prime

        Create a method to check if the given N is a prime number
            parameter: int
            return: boolean

        A number is prime if it is only divisible by one and itself

        Ex:
            7 -> prime, because only 1 and 7 can be divided evenly
            6 -> not prime, because 6 is divisible by 2 and 3 also
     */