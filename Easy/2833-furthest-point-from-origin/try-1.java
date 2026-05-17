/*
 * Problem #2833: Furthest Point From Origin
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/24/2026, 3:44:35 PM
 * Link: https://leetcode.com/problems/furthest-point-from-origin/
 */

class Solution {

    public int furthestDistanceFromOrigin(String moves) {
        int L = 0;
        int R = 0;
        int B = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                L++;
            } else if (c == 'R') {
                R++;
            } else {
                B++;
            }
        }
        return Math.abs(L - R) + B;
    }
}
