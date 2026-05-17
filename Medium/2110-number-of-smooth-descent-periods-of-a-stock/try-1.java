/*
 * Problem #2110: Number of Smooth Descent Periods of a Stock
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/15/2025, 6:40:12 PM
 * Link: https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/
 */

class Solution {
    public long getDescentPeriods(int[] prices) {
       long ans=1,count=1;
       for(int i=0;i<prices.length-1;i++) {
        if(prices[i]==prices[i+1]+1) count++;
        else count=1;
        ans+=count;
       }
       return ans;
    }
}
