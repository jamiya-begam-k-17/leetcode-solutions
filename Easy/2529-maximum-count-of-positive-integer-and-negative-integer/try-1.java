/*
 * Problem #2529: Maximum Count of Positive Integer and Negative Integer
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/5/2025, 10:39:02 PM
 * Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
 */

class Solution {
    public int maximumCount(int[] nums) {
        int p_sum=0;
        int n_sum=0;
        int max=0;
        for(int n:nums) {
            if(n>0) {
                p_sum++;
            } else if (n<0) {
                n_sum++;
            }
            max=Math.max(p_sum,n_sum);
        }
        return max;
    }
}
