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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root == null)
            return result;
        
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        
        while(!queue.isEmpty()){
            int lSize = queue.size();
            List<Integer> currList = new ArrayList<>(lSize);
            for(int i =0; i<lSize; i++){
                TreeNode currNode = queue.poll();

                if(i == lSize -1)
                    result.add(currNode.val);
                if(currNode.left != null)
                    queue.add(currNode.left);
                if(currNode.right != null)
                    queue.add(currNode.right);
            }
        }
        return result;
    }
}