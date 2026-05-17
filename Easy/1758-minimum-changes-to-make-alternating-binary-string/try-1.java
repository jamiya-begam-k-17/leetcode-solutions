/*
 * Problem #1758: Minimum Changes To Make Alternating Binary String
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/5/2026, 10:05:13 PM
 * Link: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
 */

class Solution {
    public int minOperations(String s) {
        int count = 0, n = s.length();
        for (int i = 0; i < n; i++)
            count += (s.charAt(i) ^ i) & 1;
          
        return Math.min(count, n - count);
    }
}
