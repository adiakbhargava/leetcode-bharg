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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        LinkedList<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int levelSize = q.size();
            int leftmostIndex = q.getFirst().index;
            int rightmostIndex = leftmostIndex;

            for(int i = 0; i < levelSize; i++){
                Pair element = q.removeFirst();
                int index = element.index;
                TreeNode node = element.node;
                
                if(node.left != null){
                    q.offer(new Pair(node.left, 2*index + 1));
                }

                if(node.right != null){
                    q.offer(new Pair(node.right, 2*index + 2));
                }
                rightmostIndex = index;
            }
            maxWidth = Math.max(maxWidth, rightmostIndex - leftmostIndex + 1);
        }

        return maxWidth;
    }

    class Pair {
        TreeNode node;
        int index;
        Pair(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
}