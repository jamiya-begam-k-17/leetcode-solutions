/*
 * Problem #9: Palindrome Number
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 10:33:16 PM
 * Link: https://leetcode.com/problems/palindrome-number/
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int xcopy = x;
        while(x>0){
            rev = (rev*10) + (x%10);
            x/=10;
        }
        return rev==xcopy;
    }
}
