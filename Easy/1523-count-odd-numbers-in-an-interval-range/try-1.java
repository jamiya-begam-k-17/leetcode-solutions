/*
 * Problem #1523: Count Odd Numbers in an Interval Range
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/7/2025, 1:23:21 PM
 * Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 */

class Solution {
    public int countOdds(int low, int high) {
        return (high + 1)/2 - (low)/2;
    }
}
