/*
 * Problem #94: Binary Tree Inorder Traversal
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/8/2025, 1:30:25 PM
 * Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }
    public void helper(TreeNode root, List<Integer> res) {
        if(root!=null){
            helper(root.left,res);
            res.add(root.val);
            helper(root.right,res);
        }
    }
}
