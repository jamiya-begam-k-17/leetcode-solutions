/*
 * Problem #1886: Determine Whether Matrix Can Be Obtained By Rotation
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 3/22/2026, 7:36:53 PM
 * Link: https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 */

class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        // at most 4 rotations
        for (int k = 0; k < 4; k++) {
            // rotation operation
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n + 1) / 2; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[n - 1 - j][i];
                    mat[n - 1 - j][i] = mat[n - 1 - i][n - 1 - j];
                    mat[n - 1 - i][n - 1 - j] = mat[j][n - 1 - i];
                    mat[j][n - 1 - i] = temp;
                }
            }

            if (isEqual(mat, target)) {
                return true;
            }
        }
        return false;
    }

    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
