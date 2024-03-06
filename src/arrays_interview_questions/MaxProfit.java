package arrays_interview_questions;

/**
 * This class contains a method to calculate the maximum profit from buying and selling stocks on different days.
 */
public class MaxProfit {


     //The main method to test the maxProfit method.
    public static void main(String[] args) {
        // Test the maxProfit method and print the result
        System.out.println("Max profit is : " + maxProfit(new int[]{8,3,3,1,4,9,12,11}));
    }

    /**
     * Calculates the maximum profit from buying and selling stocks on different days.
     * @param arr The integer array containing stock prices on different days.
     * @return The maximum profit that can be obtained.
     */
    public static int maxProfit(int[] arr) {
        // Initialize the maximum profit to 0
        int maxProfit = 0;

        // Iterate through each day to consider buying
        for (int i = 0; i < arr.length; i++) {
            // Iterate through subsequent days to consider selling
            for (int j = i + 1; j < arr.length; j++) {
                // Calculate the profit if stock is bought on day i and sold on day j
                int profit = arr[j] - arr[i];
                // Update the maximum profit if the calculated profit is greater
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        // Return the maximum profit obtained
        return maxProfit;
    }
}

   /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling oon another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */