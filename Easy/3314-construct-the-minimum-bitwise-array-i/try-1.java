/*
 * Problem #3314: Construct the Minimum Bitwise Array I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/20/2026, 9:44:57 PM
 * Link: https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
 */

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++) {
            int original = nums.get(i);
            int candidate = -1;
            for(int j=0;j<original;j++) {
                if((j | (j+1)) == original) {
                    candidate = j;
                    break;
                }
            }
            ans[i]=candidate;
        }
        return ans;
    }
}
