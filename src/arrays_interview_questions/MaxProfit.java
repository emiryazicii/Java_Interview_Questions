package arrays_interview_questions;

public class MaxProfit {

    public static void main(String[] args) {

        System.out.println("Max profit is : "+maxProfit(new int[]{8,3,3,1,4,9,12,11}));
    }

    public static int maxProfit(int[] arr){

        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] - arr[i] > maxProfit){
                    maxProfit = arr[j] - arr[i];
                }
            }
        }
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