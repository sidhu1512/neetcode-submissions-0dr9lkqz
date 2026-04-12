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
        int[] arr = new int[]{k, 0};
        trverseTree(root, arr);
        return arr[1];
    }

    public void trverseTree(TreeNode root, int[] arr ){
        if(root == null || arr[0] <= 0) return;
        trverseTree(root.left, arr);
        if(arr[0] > 0){
        arr[0] -= 1;
        if(arr[0] == 0) {
        arr[1] = root.val;
        return;
        }
        trverseTree(root.right, arr);
        }
    }
}
