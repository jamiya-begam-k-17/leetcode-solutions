/*
 * Problem #66: Plus One
 * Difficulty: Easy
 * Submission: Try 5
 * status: Accepted
 * Language: java
 * Date: 7/2/2026, 10:03:21 PM
 * Link: https://leetcode.com/problems/plus-one/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]<9) {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] new_arr = new int[digits.length+1];
        new_arr[0]=1;
        return new_arr;
    }
}
