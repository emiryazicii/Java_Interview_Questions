package arrays_interview_questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementInWords {

    public static void main(String[] args) {

        frequencyOfElements(new int[]{1,2,3,4,3,2,1,3,2,2,2,4,7,8,7});

    }

    public static void frequencyOfElements(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int each : arr) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};

        for (Integer key : map.keySet()) {
            System.out.println(key + " is " + words[map.get(key) - 1]);
        }
    }
}
 /*
        Frequency of Each Element in Words

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array. Output the frequency in a sentence using words to represent the number

        Constraints: a frequency can be any number from 1 to 10. If any frequency goes above 10 output: "more than 10" as the message

        Ex:
            input:
                frequencyElement(1,2,3,4,3,2,1,3,2,2,2,4)
            output:
                1 is two
                2 is five
                3 is three
                4 is two
     */