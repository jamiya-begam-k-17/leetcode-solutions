/*
 * Problem #3120: Count the Number of Special Characters I
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 11:21:07 AM
 * Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        int ans = 0;
        for(char ch: word.toCharArray()) {
            set.add(ch);
        }

        for(char c='a';c<='z';c++) {
            if(set.contains(c) && set.contains(Character.toUpperCase(c))) {
                ans++;
            }
        }
        return ans;
    }
}
