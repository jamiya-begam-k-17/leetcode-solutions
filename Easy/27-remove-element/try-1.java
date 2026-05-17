/*
 * Problem #27: Remove Element
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/29/2026, 8:05:13 PM
 * Link: https://leetcode.com/problems/remove-element/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=val) {
                nums[k++] = nums[i];
            } else {
                continue;
            }
        }
        return k;
    }
}
