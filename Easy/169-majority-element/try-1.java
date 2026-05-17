/*
 * Problem #169: Majority Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/29/2026, 8:44:54 PM
 * Link: https://leetcode.com/problems/majority-element/
 */

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
