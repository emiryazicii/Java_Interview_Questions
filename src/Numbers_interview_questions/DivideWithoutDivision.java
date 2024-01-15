package Numbers_interview_questions;

public class DivideWithoutDivision {

    public static void main(String[] args) {

        divideWithoutDivision(8,3);
        divideWithoutDivision(4,2);
        divideWithoutDivision(7,2);
        divideWithoutDivision(3,5);
        divideWithoutDivision(10,0);
        division(-23,5);
        division(-5,6);
        division(30,-6);

    }
    public static void divideWithoutDivision(int a, int b){

        int count = 0;
        int tempA = a;

        if(b == 0){
            System.err.println(a+" cannot divide by "+b);
        }else{
            while(a >= b ){
                count++;
                a -= b ;
            }
            System.out.println(tempA+", "+b+" -> "+tempA+" / "+b+" is "+count+" with remainder "+a);
        }
    }

    public static void division(int a , int b){

        int count = 0;
        int tempA = a;
        int tempB = b;
        int sign = (a < 0) || (b < 0) ? -1 : 1; // Determine the sign of the result

        a = Math.abs(a);
        b = Math.abs(b);

        if (b == 0) {
            System.err.println(tempA + " cannot divide by " + b);
        } else {
            while (a >= b) {
                count++;
                a -= b;
            }
            System.out.println(tempA + ", " + tempB + " -> " + tempA + " / " + tempB + " is " + sign * count + " with remainder " + a);
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