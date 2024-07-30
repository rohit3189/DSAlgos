package com.excercise.DSAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q5Test {

    Q5 q5 = new Q5();

    @Test
    public void test_ClimbingStairsWays1() {
        int ways = q5.climbStairs(2);
        Assertions.assertEquals(2, ways);
    }

    @Test
    public void test_ClimbingStairsWays2() {
        int ways = q5.climbStairs(3);
        Assertions.assertEquals(3, ways);
    }

    @Test
    public void test_ClimbingStairsWays3() {
        int ways = q5.climbStairs(5);
        Assertions.assertEquals(8, ways);
    }
}