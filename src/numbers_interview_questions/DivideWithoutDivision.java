package numbers_interview_questions;

public class DivideWithoutDivision {

    public static void main(String[] args) {

        divideWithoutDivision(8,3);
        divideWithoutDivision(4,2);
        divideWithoutDivision(7,2);
        divideWithoutDivision(3,5);
        //divideWithoutDivision(10,0);

        System.out.println("-------------------------------------------");

        division(-23,5);
        division(-5,6);
        division(30,-6);
        division(-45,-9);
        //division(12,0);

    }
    public static void divideWithoutDivision(int a, int b){ // works with only positive integers

        if(a < 0 || b < 0){
            throw new IllegalArgumentException("a or be can't be negative.");
        }

        if(b == 0){
            throw new ArithmeticException(a+" can't divide by "+b);
        }else{

            int remainder = a;
            int count = 0;

            while(remainder >= b ){
                count++;
                remainder -= b ;
            }
            System.out.println(a +", "+b+" -> "+a+" / "+b+" is "+count+" with remainder "+remainder);
        }
    }

    public static void division(int a , int b){ // works with both positive and negative integers

        if (b == 0) {
            throw new ArithmeticException(a+" can't divide by "+b);
        } else {

            int sign = (a < 0) ^ (b < 0) ? -1 : 1; // Determine the sign of the result

            int remainder = Math.abs(a);
            int divider = Math.abs(b);

            int count = 0;

            while (remainder >= divider) {
                count++;
                remainder -= divider;
            }
            System.out.println(a+ ", " + b + " -> " + a + " / " +b + " is " + (sign * count) + " with remainder " + remainder);
        }
    }
}
   /*
    Divide Without Division

    Create a method to divide two numbers without using the division operator.
    Display the division value as well as any remainder
        parameter: int, int
        return: void

    output format: num1 / num2 is resultValue with remainder $remainderValue

    edge cases:
        cannot divide by 0

    Ex:
        input: 6, 2
        output: 6 / 2 is 3 with remainder 0
    Test data:
        6, 2 -> 6 / 2 is 3 with remainder 0
        7, 2 -> 7 / 2 is 3 with remainder 1
        8, 3 -> 8 / 3 is 2 with remainder 2
        7, 0 -> Cannot divide by 0
        3, 5 -> 3 / 5 is 0 with remainder 3

 */