package collections_interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * This class contains methods to determine the frequency of characters in a given string.
 */
public class FrequencyOfCharacter {


     //The main method to test the frequencyOfCharacters method.
    public static void main(String[] args) {
        // Test the frequencyOfCharacters method with different input strings
        frequencyOfCharacters("banana apple pie");
        frequencyOfCharacters("tell me about yourself");
        frequencyOfCharacters("how are you doing today");

        System.out.println("-----------------------------------------------------------");

        // Test the frequencyOfChars method with different input strings
        frequencyOfChars("banana apple pie");
        frequencyOfChars("tell me about yourself");
        frequencyOfChars("how are you doing today");

        System.out.println("-------------------------------------------------------------");

        // Test the frequencyOfCharacter2 method with different input strings
        frequencyOfCharacter2("banana apple pie");
        frequencyOfCharacter2("tell me about yourself");
        frequencyOfCharacter2("how are you doing today");
    }

    /**
     * Determines the frequency of every character in the given string and prints the result.
     * @param str The input string.
     */
    public static void frequencyOfCharacters(String str) {
        // Create a LinkedHashMap to maintain the order of insertion and store character frequencies
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through each character in the string
        for (char eachChar : str.toCharArray()) {
            // Update the frequency of each character in the map
            map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);
        }
        // Print the map containing character frequencies
        System.out.println(map);
    }

    /**
     * Determines the frequency of every character in the given string using getOrDefault method and prints the result.
     * @param str The input string.
     */
    public static void frequencyOfChars(String str) {
        // Create a LinkedHashMap to maintain the order of insertion and store character frequencies
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        // Iterate through each character in the string
        for (char eachChar : str.toCharArray()) {
            // Update the frequency of each character in the map using getOrDefault method
            charFrequency.put(eachChar, charFrequency.getOrDefault(eachChar, 0) + 1);
        }
        // Print the map containing character frequencies
        System.out.println(charFrequency);
    }

    /**
     * Determines the frequency of every character in the given string using charAt method and prints the result.
     * @param str The input string.
     */
    public static void frequencyOfCharacter2(String str) {
        // Create a LinkedHashMap to maintain the order of insertion and store character frequencies
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            // Update the frequency of each character in the map
            map.put(eachChar, map.getOrDefault(eachChar, 0) + 1);
        }
        // Print the map containing character frequencies
        System.out.println(map);
    }
}

  /*
        Frequency of Character

        Create a method that will determine the frequency of every character in the given String
            parameter: String
            return: void

        Ex:
            input:
                frequencyOfCharacter("banana apple pie")
            output:
                {b=1, a=4, n=2,  =2, p=3, l=1, e=2, i=1}
     */

