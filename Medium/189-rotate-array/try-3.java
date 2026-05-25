/*
 * Problem #189: Rotate Array
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 5/20/2026, 12:25:04 PM
 * Link: https://leetcode.com/problems/rotate-array/
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);
        
    }
    public void reverse(int[] nums, int l, int r) {
        while(l<=r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}
