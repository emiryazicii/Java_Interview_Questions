package arrays_interview_questions;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains methods to find the frequency of each element in a string array.
 */
public class FrequencyOfEachElement {


     //The main method to test the frequencyOfEachElement, frequencyOfElements, and frequencyElements
    public static void main(String[] args) {
        // Test the frequencyOfEachElement method
        frequencyOfEachElement(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});
        // Test the frequencyOfElements method
        frequencyOfElements(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});
        // Test the frequencyElements method
        frequencyElements(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});
    }

    /**
     * Finds the frequency of each element in the array and prints the result.
     * @param array The string array to find the frequency of each element.
     */
    public static void frequencyOfEachElement(String[] array) {
        StringBuilder result = new StringBuilder();

        // Loop through each element in the array
        for (String first : array) {
            int count = 0;
            // Count the frequency of the current element in the array
            for (String each : array) {
                if(first.equals(each)){
                    count++;
                }
            }
            // Append the element and its frequency to the result string if not already appended
            if(result.indexOf(first) == -1){
                result.append(first).append(" = ").append(count).append("\n");
            }
        }
        // Print the result
        System.out.println(result);
    }

    /**
     * Finds the frequency of each element in the array and prints the result.
     * @param array The string array to find the frequency of each element.
     */
    public static void frequencyOfElements(String[] array) {
        String result = "";

        // Loop through each element in the array
        for (String first : array) {
            int count = 0;
            // Count the frequency of the current element in the array
            for (String each : array) {
                if(first.equals(each)){
                    count++;
                }
            }
            // Append the element and its frequency to the result string if not already appended
            if (!result.contains(first)){
                result += first + " = " + count + "\n";
            }
        }
        // Print the result
        System.out.println(result);
    }

    /**
     * Finds the frequency of each element in the array using a map and prints the result.
     * @param array The string array to find the frequency of each element.
     */
    public static void frequencyElements(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        // Loop through each element in the array
        for (String each : array) {
            // Increment the count of each element in the map
            if(!map.containsKey(each)){
                map.put(each,0);
            }
            map.put(each, map.get(each)+1);
        }
        // Print the result
        map.forEach((k,v) -> System.out.println(k+" = "+v));
    }
}

  /*
        Frequency Of Each Element

        Given an array find the frequency of each element. The frequency is the number of times each element appears in the array

        Ex:
            input:
                frequencyElement("Apple","Banana","Apple","Cherry")
            output:
                Apple = 2
                Banana = 1
                Cherry = 1
     */