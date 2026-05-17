/*
 * Problem #66: Plus One
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/4/2025, 6:51:05 PM
 * Link: https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        int n =digits.length;
        for(int i=n-1;i>=0;i--) {
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[n+1];
        digits[0]=1;
        return digits;
    }
}

