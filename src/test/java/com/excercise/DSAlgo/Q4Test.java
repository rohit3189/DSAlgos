package com.excercise.DSAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Q4Test {

    Q4 q4 = new Q4();

    @Test
    @DisplayName("TestCase1")
    public void testMax_Profit() {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int actual = q4.maxProfit(prices);
        Assertions.assertEquals(5, actual);
    }

    @Test
    @DisplayName("TestCase2")
    public void testMax_ProfitZero() {

        int[] prices = {7, 6, 4, 3, 1};

        int actual = q4.maxProfit(prices);
        Assertions.assertEquals(0, actual);
    }
}