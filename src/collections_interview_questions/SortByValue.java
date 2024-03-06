package collections_interview_questions;

import java.util.*;

/**
 * This class contains a method to sort a map by its values.
 */
public class SortByValue {

     //The main method to test the sortMapByValue method.
    public static void main(String[] args) {
        // Create a sample map
        Map<String,Integer> map = Map.of("b",1, "a",4, "n",2, "z",0, "p",3, "l",1, "e",2, "i",1);
        // Sort the map by value and print the result
        System.out.println(sortMapByValue(map));
    }

    /**
     * Sorts the given map by its values (from smallest to largest) and returns the sorted map.
     * @param map The input map to be sorted.
     * @return The sorted map by value.
     */
    public static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
        // Convert the map entries to a list
        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());

        // Sort the list of entries based on the values
        for(int i = 0 ; i < entries.size(); i++){
            for(int j = 0 ; j < entries.size()-1; j++){
                if(entries.get(j).getValue() > entries.get(j+1).getValue()){
                    // Swap entries if necessary
                    Map.Entry<String,Integer> temp = entries.get(j);
                    entries.set(j,entries.get(j+1));
                    entries.set(j+1, temp);
                }
            }
        }

        // Create a new LinkedHashMap to preserve the order of insertion
        Map<String, Integer> sorted = new LinkedHashMap<>();
        // Put the sorted entries back into the map
        for (Map.Entry<String, Integer> entry : entries) {
            sorted.put(entry.getKey(),entry.getValue());
        }

        return sorted;
    }
}

   /*
        Sort by Value

        Create a method that sort the given Map by the value
            parameter: Map<String, Integer>
            return: Map<String, Integer>

            assume the values are Integer that should be sorted smallest to largest

        Ex:
            input:
                sortByValue( {b=1, a=4, n=2, z=0, p=3, l=1, e=2, i=1} )
            output:
                [z=0, b=1, i=1, l=1, e=2, n=2, p=3, a=4]
     */
