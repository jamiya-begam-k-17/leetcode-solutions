/*
 * Problem #1680: Concatenation of Consecutive Binary Numbers
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/28/2026, 11:06:52 PM
 * Link: https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/
 */

class Solution {
  public int concatenatedBinary(int n) {
    final int MOD = 1_000_000_007;
    long ans = 0;

    for (int i = 1; i <= n; ++i)
      ans = ((ans << numberOfBits(i)) % MOD + i) % MOD;

    return (int) ans;
  }

  private int numberOfBits(int n) {
    return (int) (Math.log(n) / Math.log(2)) + 1;
  }
}
