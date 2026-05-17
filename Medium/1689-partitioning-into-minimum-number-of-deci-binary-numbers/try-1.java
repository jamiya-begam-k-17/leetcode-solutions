/*
 * Problem #1689: Partitioning Into Minimum Number Of Deci-Binary Numbers
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/1/2026, 3:52:42 PM
 * Link: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
 */

class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); ++i) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}
