/*
 * Problem #1351: Count Negative Numbers in a Sorted Matrix
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/28/2025, 9:23:00 PM
 * Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */

class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid[0].length;
        int m=grid.length;
        int c=0;
        for(int i=m-1;i>=0;i--) {
            for(int j=n-1;j>=0;j--) {
                if(grid[i][j]>=0) {
                    break;
                }
                c++;
            }
        }
        return c;
    }
}
