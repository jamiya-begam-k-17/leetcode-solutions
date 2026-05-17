/*
 * Problem #80: Remove Duplicates from Sorted Array II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/29/2026, 8:34:31 PM
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        boolean flag = false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1] && !flag) {
                nums[k++]=nums[i];
                flag=true;
            }
            else if(nums[i]!=nums[i-1]) {
                nums[k++]=nums[i];
                flag=false;
            }
        }
        return k;
    }
}
