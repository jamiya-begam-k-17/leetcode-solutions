/*
 * Problem #1292: Maximum Side Length of a Square with Sum Less than or Equal to Threshold
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/19/2026, 7:38:49 PM
 * Link: https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/
 */

class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] p = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                p[i][j] = mat[i - 1][j - 1]
                        + p[i - 1][j]
                        + p[i][j - 1]
                        - p[i - 1][j - 1];
            }
        }

        int left = 0;
        int right = Math.min(n, m);

        while (left <= right) {
            int mid = (left + right) / 2;
            boolean valid = false;

            for (int i = mid; i <= n; i++) {
                for (int j = mid; j <= m; j++) {
                    int sum = p[i][j]
                            - p[i - mid][j]
                            - p[i][j - mid]
                            + p[i - mid][j - mid];

                    if (sum <= threshold) {
                        valid = true;
                        break;
                    }
                }
                if (valid) break;
            }

            if (valid) {
                left = mid + 1;   // try bigger
            } else {
                right = mid - 1;  // try smaller
            }
        }

        return right;
    }
}

