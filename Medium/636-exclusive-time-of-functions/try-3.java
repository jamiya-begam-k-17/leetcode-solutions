/*
 * Problem #636: Exclusive Time of Functions
 * Difficulty: Medium
 * Submission: Try 3
 * status: Accepted
 * Language: java
 * Date: 12/3/2025, 11:06:27 PM
 * Link: https://leetcode.com/problems/exclusive-time-of-functions/
 */

class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();

        for(String log: logs) {
            String[] s = log.split(":");
            int idx = Integer.valueOf(s[0]);
            int time = Integer.valueOf(s[2]);

            if(s[1].equals("start")) {
                stack.push(new int[] {idx,time});
            } else {
                int exclusive_time = time - stack.pop()[1] + 1;
                res[idx] += exclusive_time;
                if(!stack.isEmpty()) {
                    res[stack.peek()[0]] -= exclusive_time;
                }
            }
        }
        return res;
    }
}
