package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * This class contains a method to remove all palindrome strings from a list of strings.
 */
public class RemovePalindrome {


     //The main method to test the removePalindrome method.
    public static void main(String[] args) {
        // Test removePalindrome method
        System.out.println(removePalindrome(new ArrayList<>(Arrays.asList("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop"))));
    }

    /**
     * Removes all palindrome strings from the list and returns the modified list.
     * @param list The input list of strings.
     * @return The list with palindrome strings removed.
     */
    public static List<String> removePalindrome(List<String> list){
        // Use iterator to traverse the list and remove palindrome strings
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String word = it.next();
            String reversed = "";
            // Reverse the word
            for (int i = word.length()-1; i >=0 ; i--) {
                reversed += word.charAt(i);
            }
            // Check if the word is a palindrome and remove it if it is
            if(word.equalsIgnoreCase(reversed)){
                it.remove();
            }
        }
        return list;
    }
}

  /*
        Remove Palindrome Strings

        Create a method that will accept a List of Strings and return the List with all palindrome Strings removed
            parameter: List<String>
            return: List<String>

        Ex:
            input:
                removePalindrome("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop")
            output:
                [hello, java, house, you]

     */
