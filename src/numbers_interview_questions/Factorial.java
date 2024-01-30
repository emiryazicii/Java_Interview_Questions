package numbers_interview_questions;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {


        System.out.println(factorial(2));
        System.out.println(factorial2(20));
        System.out.println(factorial3(150));
        System.out.println(factorial4(0));
        System.out.println(factorial5(4));
        System.out.println(factorial5(0));
        System.out.println(factorial5(-1));
    }

    public static int factorial(int number){

        if(number < 0){
            System.err.println("Number can't be negative");
            System.exit(1);
        }
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorial2(int number) {

        if (number < 0) {
            System.err.println("Number can't be negative");
            System.exit(1);
        }
        if (number == 0) {
            return 1;
        }
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static BigInteger factorial3(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number can't be negative");
        }
        if (number == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int factorial4(int n){

        if(n < 0){
            System.err.println("Number can't be negative");
            System.exit(1);
        }
        int result = 1;

        while(n > 1){
            result *= n--;
        }
        return result;
    }

    public static int factorial5(int n){

        if(n < 0){
            System.err.println("Number can't be negative");
            System.exit(1);
        }

        if(n == 1 || n == 0){
            return 1;
        }
        return n* factorial5(n-1);
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
