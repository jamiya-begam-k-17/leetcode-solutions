/*
 * Problem #3379: Transformed Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/5/2026, 11:29:16 AM
 * Link: https://leetcode.com/problems/transformed-array/
 */

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[]res = new int[n];
        for(int i=0;i<n;i++) {
            res[i]=nums[(((i+nums[i])%n)+n)%n];
        }
        return res;
    }
}
