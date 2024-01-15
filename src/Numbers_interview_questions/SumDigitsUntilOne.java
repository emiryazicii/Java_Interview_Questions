package Numbers_interview_questions;

public class SumDigitsUntilOne {

    public static void main(String[] args) {

        System.out.println(sumDigitsUntilOne(45659));
        System.out.println(sumDigitsUntilOne(3244));
        System.out.println(sumDigitsUntilOne(24536));
        System.out.println(sumDigitsUntilOne(45));

    }

    public static int sumDigitsUntilOne(int n){

        while(n / 10 != 0){
            int sum = 0 ;
            while(n != 0){
                sum += n%10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}
    /*
        Sum All Digits Until One Digit

        Create a method to calculate the sum of all the digits until there is only one digit left. The sum becomes the next number
            parameter: int
            return: int

        Ex:
        input: 45659
        output:
                2

        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2

        Test data
            45659 -> 29 -> 11 -> 2
            3244 -> 13 -> 4
            24536 -> 20 -> 2

     */