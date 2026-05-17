/*
 * Problem #2054: Two Best Non-Overlapping Events
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/23/2025, 10:35:51 PM
 * Link: https://leetcode.com/problems/two-best-non-overlapping-events/
 */

class Solution {

    public int maxTwoEvents(int[][] events) {
        //Create a PriorityQueue to store the pair ending time and value.
        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(
            Comparator.comparingInt(Pair::getKey)
        );

        //Sort the array in ascending order
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int maxVal = 0, maxSum = 0;

        for (int[] event : events) {
            // Poll all valid events from queue and take their maximum.
            while (!pq.isEmpty() && pq.peek().getKey() < event[0]) {
                maxVal = Math.max(maxVal, pq.peek().getValue());
                pq.poll();
            }

            maxSum = Math.max(maxSum, maxVal + event[2]);
            pq.add(new Pair<>(event[1], event[2]));
        }

        return maxSum;
    }
}
