package com.excercise.DSAlgo;

/**
 * Given an unsorted array nums, find the sum of the maximum sum subarray.
 * The maximum sum subarray is an array of contiguous elements in nums
 * for which the sum of the elements is maximum.
 */

public class Q1 {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Q1 q1 = new Q1();
        System.out.println(q1.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
