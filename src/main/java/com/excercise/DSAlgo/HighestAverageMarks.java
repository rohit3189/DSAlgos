package com.excercise.DSAlgo;

import java.util.*;

public class HighestAverageMarks {
    public static void main(String[] args) {
        String[][] str = {
                {"Karan", "55"},
                {"Shivam", "68"},
                {"Karan", "97"
                }};

        HighestAverageMarks h = new HighestAverageMarks();
        h.findHighestAverageMarks(str);
    }

    public Map<String, Integer> findHighestAverageMarks(String[][] str) {

        Map<String, Integer> map = new LinkedHashMap<>();
        String name = "";

        for (int row = 0; row < str.length; row++) {
            int marks = 0;
            int average;
            int sum = 0;
            int count = 0;
            for (int col = 0; col < str[row].length; col++) {
                if (col == 0) {
                    name = str[row][col];
                }
                if (col != 0) {
                    marks = Integer.parseInt(str[row][col]);
                }
                if (marks != 0) {
                    map.put(name, marks);
                }
                if (map.containsKey(name)) {
                    count++;
                    sum = sum + map.get(name);
                }
            }
            average = sum / count;
            map.put(name, average);
        }

        System.out.println(map);

        Map<String, Integer> resultMap = new HashMap<>();

        map.entrySet()
           .stream()
           .distinct()
           .min((key1, key2) -> map.get(key2.getKey()) - map.get(key1.getKey()))
           .ifPresentOrElse((e) -> resultMap.put(e.getKey(), e.getValue()),
                            () -> System.out.println("Highest average not found!"));

        return resultMap;
    }
}
