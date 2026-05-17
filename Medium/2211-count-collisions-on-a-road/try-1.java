/*
 * Problem #2211: Count Collisions on a Road
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/4/2025, 9:43:34 AM
 * Link: https://leetcode.com/problems/count-collisions-on-a-road/
 */

class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int l = 0;
        int r = n-1;

        while(l<n && directions.charAt(l)=='L') {
            l++;
        } 

        while(r>=l && directions.charAt(r)=='R') {
            r--;
        }

        int res = 0;
        for(int i=l;i<=r;i++) {
            if(directions.charAt(i)!='S') {
                res++;
            }
        }
        return res;
    }
}
