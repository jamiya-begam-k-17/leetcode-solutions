/*
 * Problem #3761: Minimum Absolute Distance Between Mirror Pairs
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/17/2026, 10:01:35 PM
 * Link: https://leetcode.com/problems/minimum-absolute-distance-between-mirror-pairs/
 */

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int min = n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(map.containsKey(nums[i]) && map.get(nums[i])<i) {
                min = Math.min(min, Math.abs(i-map.get(nums[i])));
            }
            int rev = reverse(nums[i]);
            map.put(rev,i);
        }

        System.out.println(map);
        return min==n?-1:min;
    }
    public int reverse(int m) {
        int rev = 0;
        while(m>0) {
            int dig = m%10;
            rev = dig + rev*10;
            m/=10;
        }
        return rev;
    }
}
