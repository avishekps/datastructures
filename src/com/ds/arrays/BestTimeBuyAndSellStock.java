package com.ds.arrays;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeBuyAndSellStock {
    public static void main(String[] s) {

        int[] arr = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length==0) {
            return 0;
        }
        int res=0, cMax=prices[prices.length-1];
        for (int i=prices.length-2;i>=0;i--) {

            if (prices[i] >= cMax) {
                cMax = prices[i];
            } else {
                res = Math.max(res, (cMax-prices[i]));
            }

        }
        return res;
    }
}
