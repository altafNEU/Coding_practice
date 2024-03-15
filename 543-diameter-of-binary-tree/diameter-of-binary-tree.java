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
        
        int g_d = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return g_d-1;
    }
    int height(TreeNode node){
        if(node == null)
            return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);

        int l_d = leftH+rightH + 1;
        g_d = Math.max(g_d,l_d);

        return Math.max(leftH ,rightH) + 1;
    }     
}