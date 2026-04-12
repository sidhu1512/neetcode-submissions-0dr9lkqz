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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res =  new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue =  new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){            
            List<Integer> level = new ArrayList<>();

            for(int i=queue.size(); i> 0 ; i--){
                TreeNode curr = queue.poll();
               
                level.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);               
            }
            if(level.size() > 0) res.add(level);
            
        }

    return res;
    }
}
