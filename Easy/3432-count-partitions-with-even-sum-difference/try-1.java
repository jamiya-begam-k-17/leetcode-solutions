/*
 * Problem #3432: Count Partitions with Even Sum Difference
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/5/2025, 10:30:29 PM
 * Link: https://leetcode.com/problems/count-partitions-with-even-sum-difference/
 */

class Solution {
    public int countPartitions(int[] nums) {
        int tot_sum=0;
        for(int n:nums) {
            tot_sum+=n;
        }
        return tot_sum%2==0 ? nums.length-1:0;
    }
}
