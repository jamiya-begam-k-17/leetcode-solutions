/*
 * Problem #9: Palindrome Number
 * Difficulty: Easy
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 7/1/2026, 10:06:23 PM
 * Link: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int x_copy = x;
        int num=0;
        while(x>0) {
            num = (num*10) + x%10;
            x/=10;
        }
        return num==x_copy;
    }
}
