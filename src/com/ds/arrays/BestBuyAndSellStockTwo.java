package com.ds.arrays;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestBuyAndSellStockTwo {
    public static void main(String[] s) {

        int[] arr= {7,1,5,3,6,4};
        System.out.println("Max Profit: " + maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {

        int profit = 0;
        for (int i=1;i<prices.length;i++) {
            if (prices[i] > prices[i-1]) {
                profit+= (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
