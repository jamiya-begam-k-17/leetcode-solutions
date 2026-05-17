/*
 * Problem #1461: Check If a String Contains All Binary Codes of Size K
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/23/2026, 6:52:14 PM
 * Link: https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
 */

class Solution {
    public boolean hasAllCodes(String s, int k) {
        int req = 1 << k;
        boolean[] seen = new boolean[req];
        int mask = req - 1;
        int hash = 0;

        for (int i = 0; i < s.length(); ++i) {
            hash = ((hash << 1) & mask) | (s.charAt(i) & 1);

            if (i >= k - 1 && !seen[hash]) {
                seen[hash] = true;
                req--;
                if (req == 0) return true;
            }
        }

        return false;
    }
}
