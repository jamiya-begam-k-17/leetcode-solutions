/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/20/2026, 12:02:36 PM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxProfit = 0;
        for(int i=1;i<n;i++) {
            int cost = prices[i]-min;
            maxProfit = Math.max(maxProfit,cost);
            min = Math.min(min,prices[i]);
        }
        return maxProfit;
    }
}
