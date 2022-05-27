package com.melvinkimathi.com.blind75questions.arrays;

public class bestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        if(prices.length == 0) return maxProfit;

        for (int i=0; i < prices.length -1; i++) {
            for (int j=i+1; j < prices.length; j++) {
                if(prices[j] > prices[i]) {
                   int currentProfit = prices[j] - prices[i];
                   maxProfit = Math.max(currentProfit, maxProfit);
                }
            }
        }

        return maxProfit;
    }

    //optimal solution
    public static int maxProfitOptimal(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            } else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,4,5,7,9};
        System.out.printf("max profit: " + maxProfitOptimal(prices));
    }
}
