package com.excercise.DSAlgo;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */

public class Q4 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Q4 q4 = new Q4();
        int maxProfit = q4.maxProfit(prices);
        System.out.println(maxProfit);
    }

    public int maxProfit(int[] prices) {

        int maxProfit = 0, costPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {

            int sellingPrice = prices[i];
            int profit = sellingPrice - costPrice;
            maxProfit = Math.max(profit, maxProfit);
            costPrice = Math.min(costPrice, prices[i]);
        }
        return maxProfit;
    }
}