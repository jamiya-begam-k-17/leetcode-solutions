/*
 * Problem #3010: Divide an Array Into Subarrays With Minimum Cost I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/1/2026, 9:01:58 PM
 * Link: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/
 */

class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++) {
            if(nums[i]<min1) {
                min2=min1;
                min1=nums[i];
            } else if(min2>nums[i]) {
                min2=nums[i];
            } else if(min1==1 && min2==1) {
                break;
            }
        }
        return first+min1+min2;
    }
}
