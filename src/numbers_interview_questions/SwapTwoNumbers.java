package numbers_interview_questions;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        swapTwoValues(4,14);
        swapTwoNumbers(4,14);

    }
    public static void swapTwoValues(int a , int b){

        a = a+b ;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void swapTwoNumbers(int a, int b){

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
 /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */