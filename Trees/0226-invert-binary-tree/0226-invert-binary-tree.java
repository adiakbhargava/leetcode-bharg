/*
 * class TreeNode {
 *  Integer val;
 *  TreeNode left;
 *  TreeNode right;
 * 
 *  TreeNode(Integer val) {
 *      this.val = val;
 *      this.left = null;
 *      this.right = null;
 *   }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode leftTemp = root.left;
        root.left = root.right;
        root.right = leftTemp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}