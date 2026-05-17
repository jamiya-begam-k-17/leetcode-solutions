/*
 * Problem #744: Find Smallest Letter Greater Than Target
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/31/2026, 8:26:17 PM
 * Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch:letters)  {
            if(ch>target) {
                return ch;
            }
        }
        return letters[0];
    }
}
