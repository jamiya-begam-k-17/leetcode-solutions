/*
 * Problem #462: Minimum Moves to Equal Array Elements II
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 12:44:05 AM
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
 */

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[n/2];
        
        int moves = 0;
        for(int num:nums) {
            moves+= Math.abs(num-median);
        }
        return moves;
    }
}
