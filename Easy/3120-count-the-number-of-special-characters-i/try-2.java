/*
 * Problem #3120: Count the Number of Special Characters I
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 11:24:35 AM
 * Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
 */

class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for(char ch : word.toCharArray()) {

            if(Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else {
                upper[ch - 'A'] = true;
            }
        }

        int ans = 0;

        for(int i = 0; i < 26; i++) {
            if(lower[i] && upper[i]) {
                ans++;
            }
        }

        return ans;
    }
}
