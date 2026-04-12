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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> queue =  new PriorityQueue<>();
        trverseTree(root, queue);
        // int ans = 0;
        for(int i =1; i< k ; i++){
            queue.poll();
        }
        return queue.poll();
    }

    public void trverseTree(TreeNode root, PriorityQueue<Integer> queue){
        if(root == null) return;
        queue.add(root.val);
        trverseTree(root.left, queue);
        trverseTree(root.right, queue);
    }
}
