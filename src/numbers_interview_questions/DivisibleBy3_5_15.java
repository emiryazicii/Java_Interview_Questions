package numbers_interview_questions;

/**
 * This class provides a method to display numbers divisible by 3, 5, and 15 separately within a given range.
 */
public class DivisibleBy3_5_15 {


     //Main method to test the displayDivisibility method.
    public static void main(String[] args) {
        displayDivisibility(100);
    }

    /**
     * Method to display numbers divisible by 3, 5, and 15 separately within the range from 1 to the given number.
     *
     * @param num The upper limit of the range.
     */
    public static void displayDivisibility(int num) {
        String divisibleBy15 = "", divisibleBy5 = "", divisibleBy3 = "";

        // Iterate through the range from 1 to num
        for (int i = 1; i <= num; i++) {
            // Check divisibility by 15 and append to divisibleBy15 if true
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            } else if (i % 5 == 0) { // Check divisibility by 5 and append to divisibleBy5 if true
                divisibleBy5 += i + " ";
            } else if (i % 3 == 0) { // Check divisibility by 3 and append to divisibleBy3 if true
                divisibleBy3 += i + " ";
            }
        }

        // Print the grouped sections separately
        System.out.println("Divisible By 15: " + divisibleBy15.trim() + "\nDivisible By 5: " + divisibleBy5.trim() + "\nDivisible By 3: " + divisibleBy3.trim());
    }
}

 /*
        Divisible By 3, 5 & 15

        Create a program that will print all the numbers divisible by 3, 5, and 15 in the range from 1 to the given N number. Print the grouped sections separately

         Ex:
            input: 100
            output:
                 Divisible By 15: 15 30 45 60 75 90
                 Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */
