/*
 * Problem #3315: Construct the Minimum Bitwise Array II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/21/2026, 11:25:38 PM
 * Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-ii/
 */

class Solution {

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            int res = -1;
            int d = 1;
            while ((x & d) != 0) {
                res = x - d;
                d <<= 1;
            }
            result[i] = res;
        }
        return result;
    }
}
