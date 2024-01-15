package Numbers_interview_questions;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverseIntegerNumber(1234));
        System.out.println(reverseIntegerNumber2(1234));

    }

    public static int reverseIntegerNumber(int n){

        String numStr = String.valueOf(n);
        String reversedNum = "";

        for (int i = numStr.length()-1; i >=0 ; i--) {
            reversedNum += numStr.charAt(i);
        }
        return Integer.parseInt(reversedNum);
    }

    public static int reverseIntegerNumber2(int n) {

        int reversedNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
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
