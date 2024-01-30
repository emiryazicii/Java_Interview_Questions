package numbers_interview_questions;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacci(8));
        System.out.println(fibonacci2(8));
        System.out.println(fibonacci2(1));

    }
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        int current = 0;
        int nextFib = 1;

        for (int i = 2; i <= n; i++) {
            int temp = current + nextFib;
            current = nextFib;
            nextFib = temp;
        }
        return nextFib;
    }

    public static int fibonacci2(int n){

        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        if(n < 2 ){
            return n;
        }
        return fibonacci2(n-2)+fibonacci2(n-1);
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