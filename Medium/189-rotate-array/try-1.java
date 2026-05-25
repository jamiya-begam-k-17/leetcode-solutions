/*
 * Problem #189: Rotate Array
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/20/2026, 12:19:21 PM
 * Link: https://leetcode.com/problems/rotate-array/
 */

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if(n==1) return;
        int j=0;
        int[] ans = new int[n];
        k = k%n;
        
        for(int i=n-k;i<n;i++) {
            ans[j++] = nums[i];
        }

        for(int i=0;i<n-k;i++) {
            ans[j++] = nums[i];
        }

        for(int i=0;i<n;i++) {
            nums[i] = ans[i];
        }
    }
}
