/*
 * Problem #2144: Minimum Cost of Buying Candies With Discount
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 6/1/2026, 12:14:16 PM
 * Link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
 */

class Solution {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int res = 0;
        int n = cost.length;
        for (int i = n - 1; i >= 0; --i) {
            if ((n - 1 - i) % 3 != 2) {
                res += cost[i];
            }
        }
        return res;
    }
}
