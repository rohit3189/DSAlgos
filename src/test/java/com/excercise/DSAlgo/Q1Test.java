package com.excercise.DSAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q1Test {

    Q1 q1 = new Q1();

    @Test
    public void testMaxSubArray_TestCase1() {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int actual = q1.maxSubArray(nums);
        Assertions.assertEquals(6, actual);
    }

    @Test
    public void testMaxSubArray_TestCase2() {
        int[] nums = new int[]{1};
        int actual = q1.maxSubArray(nums);
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testMaxSubArray_TestCase3() {
        int[] nums = new int[]{5, 4, -1, 7, 8};
        int actual = q1.maxSubArray(nums);
        Assertions.assertEquals(23, actual);
    }
}
