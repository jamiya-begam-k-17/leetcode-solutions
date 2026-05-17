/*
 * Problem #3637: Trionic Array I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/3/2026, 9:01:30 PM
 * Link: https://leetcode.com/problems/trionic-array-i/
 */

class Solution {

    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int p = i - 1;
        while (i < n && nums[i - 1] > nums[i]) {
            i++;
        }
        int q = i - 1;
        while (i < n && nums[i - 1] < nums[i]) {
            i++;
        }
        int flag = i - 1;
        return (p != 0) && (q != p) && (flag == n - 1 && flag != q);
    }
}
