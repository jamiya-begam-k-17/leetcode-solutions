/*
 * Problem #1404: Number of Steps to Reduce a Number in Binary Representation to One
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/26/2026, 7:59:41 AM
 * Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/
 */

class Solution {
    public int numSteps(String s) {
        int steps = 0, carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {
            if ((s.charAt(i) & 1) + carry == 1) {
                steps += 2;
                carry = 1;
            } else
                steps += 1;
        }

        return steps + carry;
    }
}
