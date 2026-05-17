/*
 * Problem #961: N-Repeated Element in Size 2N Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/2/2026, 7:42:47 PM
 * Link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/2;
        for(int num:nums) {
            if(map.get(num)==n) {
                return num;
            }
        }
        return 0;
    }
}
