package collections_interview_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        frequencyOfCharacters("banana apple pie");
        frequencyOfCharacters("tell me about yourself");
        frequencyOfCharacters("how are you doing today");

        System.out.println("-----------------------------------------------------------");

        frequencyOfChars("banana apple pie");
        frequencyOfChars("tell me about yourself");
        frequencyOfChars("how are you doing today");

        System.out.println("-------------------------------------------------------------");

        frequencyOfCharacter2("banana apple pie");
        frequencyOfCharacter2("tell me about yourself");
        frequencyOfCharacter2("how are you doing today");

    }

    public static void frequencyOfCharacters(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char eachChar : str.toCharArray()) {

            if(!map.containsKey(eachChar)){
                map.put(eachChar,0);
            }
                map.put(eachChar, map.get(eachChar) + 1);
        }
        System.out.println(map);
    }

    public static void frequencyOfChars(String str){

        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        for (char eachChar : str.toCharArray()) {
            charFrequency.put(eachChar,charFrequency.getOrDefault(eachChar,0)+1);
        }
        System.out.println(charFrequency);
    }

    public static void frequencyOfCharacter2(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){
            char eachChar = str.charAt(i);

            if(!map.containsKey(eachChar)){
                map.put(eachChar, 0);
            }
            map.put(eachChar, map.get(eachChar) + 1);
        }
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

