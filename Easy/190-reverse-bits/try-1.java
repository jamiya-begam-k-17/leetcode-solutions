/*
 * Problem #190: Reverse Bits
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/16/2026, 10:16:03 PM
 * Link: https://leetcode.com/problems/reverse-bits/
 */

class Solution {
    public int reverseBits(int n) { return rev(n, 32); }

    private int rev(int v, int len) {
        if (len == 1) return v & 1;

        int half = len >> 1;
        int mask = (1 << half) - 1;
        int lo = v & mask;
        int hi = v >>> half;

        return (rev(lo, half) << half) | rev(hi, half);
    }
}

