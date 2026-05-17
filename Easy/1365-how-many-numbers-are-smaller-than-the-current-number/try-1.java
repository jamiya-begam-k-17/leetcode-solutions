/*
 * Problem #1365: How Many Numbers Are Smaller Than the Current Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 11:06:47 PM
 * Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            int num = nums[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(num>nums[j]){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
