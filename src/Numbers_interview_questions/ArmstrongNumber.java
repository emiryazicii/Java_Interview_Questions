package Numbers_interview_questions;

public class ArmstrongNumber {

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));
        System.out.println(isArmstrong(9475));
        System.out.println(isArmstrong(123));
        System.out.println(isArmstrong2(153));
        System.out.println(isArmstrong2(154));
        System.out.println(isArmstrong3(153));
        System.out.println(isArmstrong3(154));
        System.out.println(isArmstrong4(153));
        System.out.println(isArmstrong4(371));
        System.out.println(isArmstrong4(9474));

    }

    public static boolean isArmstrong(int number){

        String num = ""+number;
        int pow = num.length();
        int sum = 0;

        for(int i = 0; i < num.length() ; i++){
            int eachDigit = Integer.parseInt(num.substring(i,i+1));
            sum += (int)Math.pow(eachDigit,pow);
        }
        return sum == number;
    }

    public static boolean isArmstrong2(int n){

        int temp = n;
        int digits = 0;

        while(temp > 0){
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while(temp > 0 ){
            int eachDigit = temp % 10 ;
            sum += (int)Math.pow(eachDigit,digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static boolean isArmstrong3(int number) {

        String num = "" + number;
        int pow = num.length();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            int eachDigit = Integer.parseInt(num.substring(i, i + 1));
            int digitPower = 1;

            for (int j = 0; j < pow; j++) {
                digitPower *= eachDigit;
            }

            sum += digitPower;
        }
        return sum == number;
    }

    public static boolean isArmstrong4(int n) {
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int eachDigit = temp % 10;
            int digitPower = 1;

            for (int i = 0; i < digits; i++) {
                digitPower *= eachDigit;
            }

            sum += digitPower;
            temp /= 10;
        }
        return sum == n;
    }
}
  /*
        Armstrong

        Create a method to check if a number is an Armstrong number
            parameter: int
            return: boolean

        An Armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number

            -> these numbers are also called narcissistic numbers

        Ex:
            input: 153
            output: true

            the digits are 1, 5, and 3
            the calculation would be:
            1^3 + 5^3 + 3^3
                -> why is the exponent 3? because there is 3 digits in the number

            1^3 = 1 * 1 * 1 = 1
            5^3 = 5 * 5 * 5 = 125
            3^3 = 3 * 3 * 3 = 27

            1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an Armstrong number

        Test data:
            153 -> true
            371 -> true
            9474 -> true
            9475 -> false
            123 -> false
     */