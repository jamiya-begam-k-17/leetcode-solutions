/*
 * Problem #1848: Minimum Distance to the Target Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/13/2026, 11:12:35 PM
 * Link: https://leetcode.com/problems/minimum-distance-to-the-target-element/
 */

class Solution {

    public int getMinDistance(int[] nums, int target, int start) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res = Math.min(res, Math.abs(i - start));
            }
        }
        return res;
    }
}
