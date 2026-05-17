/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/29/2026, 8:14:43 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int prev = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=prev) {
                nums[k++]=nums[i];
                prev=nums[i];
            }
        }
        return k;
    }
}
