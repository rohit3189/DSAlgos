package com.excercise.DSAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class HighestAverageMarksTest {

    HighestAverageMarks h = new HighestAverageMarks();

    @Test
    public void testCase1() {
        String[][] str = {
                {"Bob", "80"},
                {"Rob", "70"},
                {"Charles", "85"},
                {"Bob", "100"},
                {"Charles", "75"}};

        Assertions.assertEquals(Map.of("Bob", 90), h.findHighestAverageMarks(str));
    }

    @Test
    public void testCase2() {
        String[][] str = {
                {"Shubham", "55"},
                {"Shivam", "68"},
                {"Shubham", "97"},
                {"Ritika", "97"}};

        Assertions.assertEquals(Map.of("Ritika", 97), h.findHighestAverageMarks(str));
    }

    @Test
    public void testCase3() {
        String[][] str = {
                {"Karan", "55"},
                {"Shivam", "68"},
                {"Karan", "97"
                }};

        Assertions.assertEquals(Map.of("Karan", 76), h.findHighestAverageMarks(str));
    }
}
