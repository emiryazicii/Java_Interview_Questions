package collections_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome {

    public static void main(String[] args) {

        System.out.println(removePalindrome(new ArrayList<>(Arrays.asList("hello", "java", "anna", "mom", "house", "racecar", "you", "abcba", "pop"))));


    }

    public static List<String> removePalindrome(List<String> list){

        Iterator<String> it = list.iterator();

        while(it.hasNext()){

            String word = it.next();
            String reversed = "";

            for (int i = word.length()-1; i >=0 ; i--) {
                reversed += word.charAt(i);
            }

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
