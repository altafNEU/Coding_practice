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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();

        if(root == null)
            return result;
        queue.addFirst(root);

        boolean flag = false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            
            for(int i = 0;i<levelSize; i++){

            if(!flag){
                TreeNode currNode = queue.removeFirst();
                currLevel.add(currNode.val);
                if(currNode.left != null)
                    queue.addLast(currNode.left);
                if(currNode.right != null)
                    queue.addLast(currNode.right);
                }
                
            if(flag){
                TreeNode currNode = queue.removeLast();
                currLevel.add(currNode.val);
                if(currNode.right != null)
                    queue.addFirst(currNode.right);
                if(currNode.left != null)
                    queue.addFirst(currNode.left);
                }
            }            
            result.add(currLevel);
            flag = !flag;
        }return result;

    }
}