package com.excercise.DSAlgo;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class Q5 {
    public static void main(String[] args) {
        Q5 q5 = new Q5();
        int ways = q5.climbStairs(2);
        System.out.println(ways);
    }

    public int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return n;
        }
        int a = 1, b = 2, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}