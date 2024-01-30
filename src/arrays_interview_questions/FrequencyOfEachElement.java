package arrays_interview_questions;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {


    public static void main(String[] args) {

        frequencyOfEachElement(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});
        frequencyOfElements(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});
        frequencyElements(new String[]{"Apple","Banana","Apple","Cherry", "Apple", "Cherry"});

    }

    public static void frequencyOfEachElement(String[] array) {

       StringBuilder result = new StringBuilder();

        for (String first : array) {
           int count = 0;
            for (String each : array) {
                if(first.equals(each)){
                    count++;
                }
            }
            if(result.indexOf(first) == -1){
                result.append(first).append(" = ").append(count).append("\n");
            }
        }
        System.out.println(result);
    }

    public static void frequencyOfElements(String[] array){

        String result = "";

        for (String first : array) {
            int count = 0;
            for (String each : array) {
                if(first.equals(each)){
                    count++;
                }
            }
            if (!result.contains(first)){
                result += first+" = "+count+"\n";
            }
        }
        System.out.println(result);
    }

    public static void frequencyElements(String[] array){

        Map<String, Integer> map = new HashMap<>();

        for (String each : array) {
            if(!map.containsKey(each)){
                map.put(each,0);
            }
            map.put(each, map.get(each)+1);
        }
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