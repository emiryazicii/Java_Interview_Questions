package numbers_interview_questions;

/**
 * This class provides methods to work with binary representations of numbers.
 */
public class BinaryRepresentationOfNumber {


    //Main method to test binary representation functions.
    public static void main(String[] args) {
        System.out.println(binaryOfNum(6));
        System.out.println(countOnesInBinary(7));
        System.out.println(countOnesInBinary(4));
        System.out.println(countOnesInBinary(10));
        System.out.println(countOnesInBinary(15));
    }

    /**
     * Method to return the number of '1's in the binary representation of a number.
     *
     * @param n The input number.
     * @return The number of '1's in the binary representation of the input number.
     */
    public static int binaryOfNum(int n) {
        String binary = "";

        // Convert the input number to binary representation
        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }

        // Count the number of '1's in the binary representation
        return binary.replace("0", "").length();
    }

    /**
     * Method to count the number of '1's in the binary representation of a number.
     *
     * @param n The input number.
     * @return The number of '1's in the binary representation of the input number.
     */
    public static int countOnesInBinary(int n) {
        int count = 0;

        // Count the number of '1's in the binary representation
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }
}

      /*
        Binary Representation Of N

        Create a method to determine how many 1s are in the representation of the number in binary form
            parameter: int
            return: int

            The given n will be more than 0

        Ex:
            input: 6
            output: 2

            6 in binary is 110
            there are two '1' digits, so the output is 2

        Test data:
            6 -> 110 -> 2
            7 -> 111 -> 3
            4 -> 100 -> 1
            10 -> 1010 -> 2
            15 -> 1111 -> 4
            16 -> 10000 -> 1
     */