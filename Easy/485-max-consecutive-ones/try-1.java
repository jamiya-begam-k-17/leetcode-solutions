/*
 * Problem #485: Max Consecutive Ones
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/1/2025, 11:19:18 PM
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int res=0;
        int count=0;
        for(int i=0;i<n;i++) {
            if(nums[i]==1){
                count++;
                res = Math.max(res,count);
            } else {
                count=0;
            }
        }
        return res;
    }
}
