/*
 * Problem #26: Remove Duplicates from Sorted Array
 * Difficulty: Easy
 * Submission: Try 7
 * status: Accepted
 * Language: java
 * Date: 7/2/2026, 7:25:40 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int k=1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}

