/*
 * Problem #693: Binary Number with Alternating Bits
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 2/18/2026, 7:49:29 PM
 * Link: https://leetcode.com/problems/binary-number-with-alternating-bits/
 */

class Solution {
    public boolean hasAlternatingBits(int n) {
        int cur = n % 2;
        n /= 2;
        while (n > 0) {
            if (cur == n % 2) return false;
            cur = n % 2;
            n /= 2;
        }
        return true;
    }
}
