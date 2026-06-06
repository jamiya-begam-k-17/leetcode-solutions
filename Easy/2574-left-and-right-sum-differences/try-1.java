/*
 * Problem #2574: Left and Right Sum Differences
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/6/2026, 9:27:13 PM
 * Link: https://leetcode.com/problems/left-and-right-sum-differences/
 */

class Solution {

    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; ++i) {
            ans[i] = leftSum;
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; --i) {
            ans[i] = Math.abs(ans[i] - rightSum);
            rightSum += nums[i];
        }

        return ans;
    }
}
