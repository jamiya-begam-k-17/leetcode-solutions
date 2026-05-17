/*
 * Problem #2946: Matrix Similarity After Cyclic Shifts
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/27/2026, 10:22:45 PM
 * Link: https://leetcode.com/problems/matrix-similarity-after-cyclic-shifts/
 */

class Solution {

    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        k %= n;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[i][(j + k) % n]) {
                    return false;
                }
            }
        }
        return true;
    }
}

