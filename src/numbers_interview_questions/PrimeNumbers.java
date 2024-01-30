package numbers_interview_questions;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime2(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime2(6));
        System.out.println(isPrime(2));
        System.out.println(isPrime2(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime2(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime2(4));
        System.out.println(isPrime(25));
        System.out.println(isPrime2(25));

    }

    public static boolean isPrime(int n) {

        if(n < 2){
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int n) {

        if (n < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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