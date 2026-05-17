/*
 * Problem #3577: Count the Number of Computer Unlocking Permutations
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/10/2025, 7:23:34 PM
 * Link: https://leetcode.com/problems/count-the-number-of-computer-unlocking-permutations/
 */

class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        for(int i=1;i<n;i++) {
            if(complexity[i]<=complexity[0]) {
                return 0;
            }
        }
        int ans = 1;
        int mod = 1000000007;
        for(int i=2;i<n;i++) {
            ans = (int) (((long) ans * i) % mod);
        }
        return ans;
    }
}
