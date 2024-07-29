package com.excercise.DSAlgo;

import java.util.Arrays;

/**
 * Given two integer arrays, nums1 and nums2, of size m and n,
 * respectively, sorted in non-decreasing order.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */

public class Q2 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;

        Q2 q2 = new Q2();
        q2.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
