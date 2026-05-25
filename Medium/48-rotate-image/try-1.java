/*
 * Problem #48: Rotate Image
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 1:43:05 AM
 * Link: https://leetcode.com/problems/rotate-image/
 */

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++) {
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++) {
            reverse(matrix[i]);
        }
    }
    public void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    public void reverse(int[]row) {
        int l = 0;
        int r = row.length-1;
        while(l<r) {
            int temp = row[l];
            row[l] = row[r];
            row[r] = temp;

            l++;
            r--;
        }
    }
}
