/*
 * Problem: 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1908381627/
 * Language: java
 * Date: 2026-02-04
 */

class Solution {
    public int maxProfit(int[] prices) {
        int minPrices= prices[0];
        int maxProfit= 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrices){
                minPrices=prices[i];
            }
            int profit = prices[i] - minPrices;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
    return maxProfit;
    }
}
