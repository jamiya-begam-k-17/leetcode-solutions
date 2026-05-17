/*
 * Problem #3075: Maximize Happiness of Selected Children
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/26/2025, 8:00:14 PM
 * Link: https://leetcode.com/problems/maximize-happiness-of-selected-children/
 */

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int h: happiness) {
            pq.add(h);
        }

        long tot = 0;
        int turns = 0;
        for(int i=0;i<k;i++) {
            tot+=Math.max(pq.poll()-turns,0);
            turns++;
        }
        return tot;
    }
}
