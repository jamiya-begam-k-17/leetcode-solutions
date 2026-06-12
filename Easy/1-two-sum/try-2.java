/*
 * Problem #1: Two Sum
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 6/12/2026, 9:01:59 PM
 * Link: https://leetcode.com/problems/two-sum/
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}












// ashMap<Integer, Integer> hm = new HashMap();
//         for(int i=0;i<nums.length;i++) {
//             int complement = target-nums[i];
//             if(hm.containsKey(complement) && hm.get(complement)!=i) {
//                 return new int[]{i, hm.get(complement)};
//             } else {
//                 hm.put(nums[i],i);
//             }
//         }
//         return new int[]{};
