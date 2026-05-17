/*
 * Problem #7: Reverse Integer
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/19/2026, 10:18:35 PM
 * Link: https://leetcode.com/problems/reverse-integer/
 */

class Solution {
    public int reverse(int x) {
        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();
        
        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        
        return isNegative ? -res : res;       
    }
}
