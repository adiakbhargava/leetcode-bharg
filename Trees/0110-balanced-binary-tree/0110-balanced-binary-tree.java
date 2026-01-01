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
    public boolean isBalanced(TreeNode root){
        return getHeightImbalance(root) != -1;
    }

    public int getHeightImbalance(TreeNode node){
        if(node == null){
            return 0;
        }

        int leftHeight = getHeightImbalance(node.left);
        int rightHeight = getHeightImbalance(node.right);

        if(leftHeight == -1 || rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}