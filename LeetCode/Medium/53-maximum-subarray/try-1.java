/*
 * Problem #53: Maximum Subarray
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/13/2026, 9:33:23 AM
 * Link: https://leetcode.com/problems/maximum-subarray/
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];

            if(sum>max) {
                max = sum;
            }

            if(sum<0) {
                sum=0;
            }
        }
        return max;
    }
}
