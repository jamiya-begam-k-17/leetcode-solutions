/*
 * Problem #453: Minimum Moves to Equal Array Elements
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 12:27:56 AM
 * Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 */

class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        int min = Arrays.stream(nums).min().getAsInt();
        
        int moves = 0;
        for(int num: nums) {
            moves += (num - min);
        }
        return moves;
    }
}
