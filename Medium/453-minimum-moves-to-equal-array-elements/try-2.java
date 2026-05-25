/*
 * Problem #453: Minimum Moves to Equal Array Elements
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 12:28:29 AM
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */

class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            min = Math.min(min, num);
        }

        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            moves += (nums[i] - min);
        }

        return moves;
    }
}
