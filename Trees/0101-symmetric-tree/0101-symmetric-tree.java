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

class Solution{
    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true;
        }
        
        return dfs(root.left, root.right);
    }

    public boolean dfs(TreeNode nodeOne, TreeNode nodeTwo){
        if(nodeOne == null && nodeTwo == null){
            return true;
        }

        if(nodeOne == null || nodeTwo == null){
            return false;
        }

        if(nodeOne.val != nodeTwo.val){
            return false;
        }

        return dfs(nodeOne.left, node2.right) && dfs(nodeOne.right, nodeTwo.left);
    }
}