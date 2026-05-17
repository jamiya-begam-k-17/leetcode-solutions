/*
 * Problem #448: Find All Numbers Disappeared in an Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 11:31:17 PM
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++) {
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
