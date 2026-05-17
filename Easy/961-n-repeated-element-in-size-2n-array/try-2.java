/*
 * Problem #961: N-Repeated Element in Size 2N Array
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 1/2/2026, 7:54:53 PM
 * Link: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums) {
            if(!set.add(n)) {
                return n;
            }
        }
        return 0;
    }
}
