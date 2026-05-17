/*
 * Problem #2483: Minimum Penalty for a Shop
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/26/2025, 8:12:44 PM
 * Link: https://leetcode.com/problems/minimum-penalty-for-a-shop/
 */

class Solution {
    public int bestClosingTime(String customers) {
        int bestTime = 0;
        int minPenalty = 0;
        int prefix = 0;

        for(int i=0;i<customers.length();i++) {
            char ch=customers.charAt(i);
            prefix+=ch=='Y'?-1:1;

            if(prefix<minPenalty) {
                bestTime=i+1;
                minPenalty=prefix;
            }
        }
        return bestTime;
    }
}
