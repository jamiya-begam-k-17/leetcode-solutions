/*
 * Problem #217: Contains Duplicate
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/26/2026, 7:50:17 AM
 * Link: https://leetcode.com/problems/contains-duplicate/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++) {
            if(nums[i]==nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
