/*
 * Problem #125: Valid Palindrome
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 1/29/2026, 9:03:33 PM
 * Link: https://leetcode.com/problems/valid-palindrome/
 */

class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r) {
            if(!Character.isLetterOrDigit(s.charAt(l)) ){
                l++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            else { 
                if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
