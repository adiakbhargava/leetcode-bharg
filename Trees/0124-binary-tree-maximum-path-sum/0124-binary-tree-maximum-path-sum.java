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
    int maxSum; 
    public int maxPathSum(TreeNode root){
        maxSum = Integer.MIN_VALUE; // or -1001 given constraints
        maxPathSumHelper(root);

        return maxSum;
    }

    public int maxPathSumHelper(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftSum = Math.max(maxPathSumHelper(node.left), 0);
        int rightSum = Math.max(maxPathSumHelper(node.right), 0);

        maxSum = Math.max(maxSum, node.val + leftSum + rightSum);

        return node.val + Math.max(leftSum, rightSum);
    }
}