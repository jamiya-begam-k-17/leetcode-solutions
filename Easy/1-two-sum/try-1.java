/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 5:36:20 PM
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0;i<nums.length;i++) {
            int complement = target-nums[i];
            if(hm.containsKey(complement) && hm.get(complement)!=i) {
                return new int[]{i, hm.get(complement)};
            } else {
                hm.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
