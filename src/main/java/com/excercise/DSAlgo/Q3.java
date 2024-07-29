package com.excercise.DSAlgo;

import java.util.Arrays;

/**
 * You’re given an integer array, nums.
 * Return a resultant array product so that product[i]
 * is equal to the product of all the elements of nums except nums[i].
 * Write an algorithm that runs in O(n) time without using the division operation.
 */

public class Q3 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Q3 q3 = new Q3();
        System.out.println(Arrays.toString(q3.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int suffix = 1;
        for (int j = n - 1; j >= 0; j--) {
            ans[j] = ans[j] * suffix;
            suffix = suffix * nums[j];
        }
        return ans;
    }
}
