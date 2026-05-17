/*
 * Problem #1022: Sum of Root To Leaf Binary Numbers
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/24/2026, 7:01:36 PM
 * Link: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
    
    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }
        
        current = current * 2 + node.val;
        
        if (node.left == null && node.right == null) {
            return current;
        }
        
        return dfs(node.left, current) + dfs(node.right, current);
    }
}
