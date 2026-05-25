/*
 * Problem #121: Best Time to Buy and Sell Stock
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 5/20/2026, 12:04:35 PM
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int p: prices) {
            maxProfit = Math.max(maxProfit,p-min);
            min = Math.min(min,p);
        }
        return maxProfit;
    }
}
