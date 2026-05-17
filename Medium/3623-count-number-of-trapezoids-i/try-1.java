/*
 * Problem #3623: Count Number of Trapezoids I
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/2/2025, 9:47:48 PM
 * Link: https://leetcode.com/problems/count-number-of-trapezoids-i/
 */

import java.math.BigInteger;
class Solution {
    static final long MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int[] p:points) {
            int y = p[1];
            freq.put(y,freq.getOrDefault(y,0)+1);
        }

        List<Long> b = new ArrayList<>();
        for(int v : freq.values()) {
            if(v>=2) {
                long comb = ((long) v*(v-1)/2) % MOD;
                b.add(comb);
            }
        }

        if(b.size()<2) return 0;

        long res = 0;
        long prefix = b.get(0);

        for(int i=1;i<b.size();i++) {
            long bi = b.get(i);
            res = (res + bi * prefix) % MOD;
            prefix = (prefix + bi) % MOD;
        }
        return (int) res;
    }
}
