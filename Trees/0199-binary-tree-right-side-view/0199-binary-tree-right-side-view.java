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
    public List<Integer> rightSideView(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int qLen = q.size();
            TreeNode rightmostNode = null;
            for(int i = 0; i < qLen; i++){
                TreeNode node = q.poll();
                if(node != null){
                    rightmostNode = node;
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(rightmostNode != null){
                res.add(rightmostNode.val);
            }
        }

        return res;
    }
}