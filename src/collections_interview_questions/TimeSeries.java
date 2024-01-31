package collections_interview_questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeSeries {

    public static void main(String[] args) {

        Map<Integer, Double> map1 = new TreeMap<>();
        map1.put(1, 1.0); map1.put(2, 1.5); map1.put(3, 2.0);

        Map<Integer, Double> map2 = new TreeMap<>();
        map2.put(2, 1.0); map2.put(3, 2.5); map2.put(5, 1.0);

        System.out.println(timeSeries(map1,map2));

    }

    public static Map<Integer, Double> timeSeries(Map<Integer, Double> map1, Map<Integer, Double> map2){

        Map<Integer, Double> combined = new TreeMap<>(map2);

        for (Integer eachKey : map1.keySet()) {
            if(!combined.containsKey(eachKey)){
                combined.put(eachKey,map1.get(eachKey));
            }else {
                combined.put(eachKey,combined.get(eachKey)+map1.get(eachKey));
            }
        }
        return combined;
    }


}
  /*
        Time Series

        Create a method that will return the summation of the given time series.A time series will be a Map holding a time/value pair.Given two time series combine them together.When a time is matched in both series the values are combined.
            parameter: Map<Integer, Double>
            return: Map<Integer, Double>

        Ex:
            input:
                 series A: {1=1.0, 2=1.5, 3=2.0}
                 series B: {2=1.0, 3=2.5, 5=1.0}
            output:
                 {1=1.0, 2=2.5, 3=4.5, 5=1.0}
     */