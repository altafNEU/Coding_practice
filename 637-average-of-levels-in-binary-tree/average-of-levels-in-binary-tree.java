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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            double currSum = 0,average = 0;
            int levelSize = queue.size();
            for(int i = 0; i<levelSize; i++){
                
                TreeNode currNode = queue.poll();
                currSum = currSum + currNode.val;
                if(currNode.left != null){
                    queue.add(currNode.left);
                } 
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
            average = currSum/levelSize;
            result.add(average);      
        }
        return result;
    }
}