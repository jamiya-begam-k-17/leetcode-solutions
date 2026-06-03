/*
 * Problem #3635: Earliest Finish Time for Land and Water Rides II
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/3/2026, 7:48:03 PM
 * Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
 */

class Solution {
    final static int MAX = 300005;

    public int earliestFinishTime(int[] la, int[] lb, int[] wa, int[] wb) {
        int l = MAX, w = MAX, minL = MAX, minW = MAX;
        int n = la.length, m = wa.length;

        for (int i = 0; i < n; ++i)
            l = Math.min(l, la[i] + lb[i]);

        for (int i = 0; i < m; ++i) {
            w = Math.min(w, wa[i] + wb[i]);
            minL = Math.min(minL, Math.max(wa[i], l) + wb[i]);
        }

        for (int i = 0; i < n; ++i)
            minW = Math.min(minW, Math.max(la[i], w) + lb[i]);

        return Math.min(minW, minL);
    }
}
