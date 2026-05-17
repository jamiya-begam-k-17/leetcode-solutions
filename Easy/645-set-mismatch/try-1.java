/*
 * Problem #645: Set Mismatch
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 10:49:19 PM
 * Link: https://leetcode.com/problems/set-mismatch/
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res[]=new int[2];
        for(int nn:nums){
            map.put(nn,map.getOrDefault(nn,0)+1);
        }
        for(int i=0;i<n;i++) {
            if(!map.containsKey(i+1)) {
                res[1]=i+1;
            }
            if(map.get(i+1)!=null && map.get(i+1)>1) {
                res[0]=i+1;
            }
        }
        return res;

    }
}
