/*
 * Problem #58: Length of Last Word
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 7/2/2026, 10:06:34 PM
 * Link: https://leetcode.com/problems/length-of-last-word/
 */

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }
}
