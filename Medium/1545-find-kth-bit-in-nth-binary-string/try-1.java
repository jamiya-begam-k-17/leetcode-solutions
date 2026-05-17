/*
 * Problem #1545: Find Kth Bit in Nth Binary String
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/3/2026, 6:03:33 AM
 * Link: https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
 */

class Solution {
        public char findKthBit(int n, int k) {
        int flip = 0, l = (1 << n) - 1;
        while (k > 1) {
            if (k == l / 2 + 1)
                return flip == 0 ? '1' : '0';
            if (k > l / 2) {
                k = l + 1 - k;
                flip ^= 1;
            }
            l /= 2;
        }
        return flip == 0 ? '0' : '1';
    }
}
