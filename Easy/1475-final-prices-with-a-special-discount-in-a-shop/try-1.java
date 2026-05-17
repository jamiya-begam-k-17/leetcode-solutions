/*
 * Problem #1475: Final Prices With a Special Discount in a Shop
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/11/2026, 9:54:44 AM
 * Link: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */

class Solution {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        // Create a copy of original prices array to store discounted prices
        int[] result = prices.clone();

        for (int i = 0; i < n; i++) {
            // Look for first smaller or equal price that comes after current item
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    // Apply discount by subtracting prices[j] from current price
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return result;
    }
}
