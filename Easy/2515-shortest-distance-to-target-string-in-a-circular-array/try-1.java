/*
 * Problem #2515: Shortest Distance to Target String in a Circular Array
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 4/15/2026, 11:29:16 AM
 * Link: https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/
 */

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int res = n;
        for(int i=0;i<n;i++) {
            if(words[i].equals(target)) {
                int dist = Math.abs(i-startIndex);
                res = Math.min(res, Math.min(dist, n-dist));
            }
        }
        return res<n? res:-1;
    }
}
