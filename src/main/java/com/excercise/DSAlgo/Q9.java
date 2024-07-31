package com.excercise.DSAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q9 {

    public static void main(String[] args) {

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        Q9 q9 = new Q9();

        System.out.println(Arrays.toString(q9.nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
