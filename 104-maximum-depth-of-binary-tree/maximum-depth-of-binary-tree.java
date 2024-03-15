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
    int gdepth = 0;
    public int maxDepth(TreeNode root) {
        lDepth(root);
        return gdepth;
    }
    int lDepth(TreeNode node){
        if(node == null)
            return 0;
        int left = lDepth(node.left);
        int right = lDepth(node.right);
        //int ldepth = 0;
        int ldepth = Math.max(left,right) + 1;
        gdepth = Math.max(ldepth,gdepth);
        
        return ldepth ;
    }
}