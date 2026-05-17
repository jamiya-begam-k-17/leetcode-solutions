/*
 * Problem #1470: Shuffle the Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/1/2025, 10:54:51 PM
 * Link: https://leetcode.com/problems/shuffle-the-array/
 */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i =0,k=0;i<nums.length && k<n;i+=2,k++) {
            arr[i]=nums[k];
            arr[i+1]=nums[n+k];
        }
        return arr;
    }
}
