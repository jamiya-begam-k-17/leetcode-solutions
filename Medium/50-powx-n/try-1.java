/*
 * Problem #50: Pow(x, n)
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 5/26/2026, 2:08:09 PM
 * Link: https://leetcode.com/problems/powx-n/
 */

class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(x==1) return 1;
        if(x==-1) return n%2==0?1:-1;

        long binform = n;
        double ans = 1;
        if(n<0) {
            x=1/x;
            binform = -binform;
        }

        while(binform>0) {
            if(binform%2==1) {
                ans*=x;
            }
            x*=x;
            binform/=2;
        }
        return ans;
    }
}
