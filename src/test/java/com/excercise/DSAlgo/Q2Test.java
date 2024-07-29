package com.excercise.DSAlgo;

import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Q2Test {

    Q2 q2 = new Q2();

    @Test
    @Order(value = 1)
    @DisplayName("TestCase1")
    public void testMerge_WhenZeroAndNonZeroElementsArePresent() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        q2.merge(nums1, m, nums2, n);
        Assertions.assertEquals(Arrays.toString(new int[]{1, 2, 2, 3, 5, 6}), Arrays.toString(nums1));
    }

    @Test
    @Order(value = 2)
    @DisplayName("TestCase2")
    public void testMerge_When2ndArraySizeIsZero() {
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;
        q2.merge(nums1, m, nums2, n);
        Assertions.assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(nums1));
    }

    @Test
    @Order(value = 3)
    @DisplayName("TestCase3")
    public void testMerge_When1stArraySizeIsZero() {
        int[] nums1 = new int[]{0};
        int m = 0;
        int[] nums2 = new int[]{1};
        int n = 1;
        q2.merge(nums1, m, nums2, n);
        Assertions.assertEquals(Arrays.toString(new int[]{1}), Arrays.toString(nums1));
    }
}
