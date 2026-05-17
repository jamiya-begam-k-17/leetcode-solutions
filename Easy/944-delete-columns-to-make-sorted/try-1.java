/*
 * Problem #944: Delete Columns to Make Sorted
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/20/2025, 6:44:40 PM
 * Link: https://leetcode.com/problems/delete-columns-to-make-sorted/
 */

class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        int count = 0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n-1;j++) {
                if(strs[j].charAt(i)>strs[j+1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
