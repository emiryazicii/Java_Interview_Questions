package Numbers_interview_questions;

public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(happyOrUnhappyNumber(32));
        System.out.println(happyOrUnhappyNumber(42));
    }

    public static String happyOrUnhappyNumber(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("Input should be positive integer");
        }

        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                int eachDigit = n % 10;
                sum += eachDigit * eachDigit;
                n /= 10;
            }
            n = sum;
        }
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