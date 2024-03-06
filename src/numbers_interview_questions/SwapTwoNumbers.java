package numbers_interview_questions;

/**
 * This class provides methods to swap the values of two variables without using a third variable.
 */
public class SwapTwoNumbers {


     //Main method to test the swapTwoValues and swapTwoNumbers methods.
    public static void main(String[] args) {
        swapTwoValues(4, 14);
        swapTwoNumbers(4, 14);
    }

    /**
     * Method to swap the values of two variables without using a third variable.
     *
     * @param a The first variable.
     * @param b The second variable.
     */
    public static void swapTwoValues(int a, int b) {
        a = a + b; // Add the values of a and b and store it in a
        b = a - b; // Subtract the original value of b from the updated value of a and store it in b
        a = a - b; // Subtract the updated value of b from the updated value of a and store it in a

        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * Method to swap the values of two variables without using a third variable.
     *
     * @param a The first variable.
     * @param b The second variable.
     */
    public static void swapTwoNumbers(int a, int b) {
        int c = 0; // Temporary variable

        // Swap the values of a and b
        c = a;
        a = b;
        b = c;

        // Print the swapped values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

 /*
        Swap Two Numbers

        Create a program that will swap two variables' values
            Do it without a third variable
     */