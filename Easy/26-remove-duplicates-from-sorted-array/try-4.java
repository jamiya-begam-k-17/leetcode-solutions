/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 4
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 12:39:47 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}

