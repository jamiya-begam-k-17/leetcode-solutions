/*
 * Problem #1929: Concatenation of Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/1/2025, 10:25:18 PM
 * Link: https://leetcode.com/problems/concatenation-of-array/
 */

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+n];
        int x = 2;
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
        for(int i=n;i<n+n;i++){
            arr[i] = nums[i-n];
        }
        return arr;
    }
}
