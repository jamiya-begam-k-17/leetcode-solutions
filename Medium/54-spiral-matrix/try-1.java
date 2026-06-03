/*
 * Problem #54: Spiral Matrix
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 12:03:13 PM
 * Link: https://leetcode.com/problems/spiral-matrix/
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int top = 0, right = m-1, bottom = n-1, left = 0;

        while(top<=bottom && left<=right) {
            for(int i=top;i<=right;i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    list.add(matrix[bottom][i]);
                }
            bottom--;
            }

            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    list.add(matrix[i][left]);
                }
            left++;
            }
        }

        return list;
    }
}
