package numbers_interview_questions;

/**
 * This class provides methods to print numbers from 1 to N with specific conditions.
 */
public class FINRA {


     //Main method to test FINRA printing methods.
    public static void main(String[] args) {
        // Test displayFinra method
        displayFinra(30);
        // Test displayFinra2 method
        displayFinra2(30);
    }

    /**
     * Method to print numbers from 1 to N with specific conditions using if-else statements.
     *
     * @param n The upper limit of the range.
     */
    public static void displayFinra(int n) {
        for (int i = 1; i <= n; i++) {
            // Check if the number is divisible by both 3 and 5
            if (i % 15 == 0) {
                System.out.println("FINRA");
            }
            // Check if the number is divisible by 5 only
            else if (i % 5 == 0) {
                System.out.println("RA");
            }
            // Check if the number is divisible by 3 only
            else if (i % 3 == 0) {
                System.out.println("FIN");
            }
            // Print the number itself if none of the above conditions are met
            else {
                System.out.println(i);
            }
        }
    }

    /**
     * Method to print numbers from 1 to N with specific conditions using a string concatenation approach.
     *
     * @param n The upper limit of the range.
     */
    public static void displayFinra2(int n) {
        for (int i = 1; i <= n; i++) {
            // Initialize an empty string to store the result
            String result = "";

            // Check if the number is divisible by 3 and concatenate "FIN" to the result string
            if (i % 3 == 0) {
                result += "FIN";
            }
            // Check if the number is divisible by 5 and concatenate "RA" to the result string
            if (i % 5 == 0) {
                result += "RA";
            }
            // Print the number itself if the result string is empty
            if (result.isEmpty()) {
                System.out.println(i);
            }
            // Otherwise, print the result string
            else {
                System.out.println(result);
            }
        }
    }
}

      /*
        FINRA - Divisibility by 3 & 5
            alternatives: FIZZBUZZ

        Create a method that will print the numbers from 1 to the given N, but
        if the number is divisible by 3 print "FIN" instead, or
        if the number is divisible by 5 print "RA" instead, or
        if the number is divisible by both 3 & 5 print "FINRA" instead

        parameter: int
        return: void

        Ex:
            input: 30
            output:
                1
                2
                FIN
                4
                RA
                FIN
                7
                8
                FIN
                RA
                11
                FIN
                13
                14
                FINRA
                16
                17
                FIN
                19
                RA
        */
