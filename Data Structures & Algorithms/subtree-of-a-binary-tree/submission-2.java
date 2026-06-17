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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (subRoot == null) return false;

        if (sameTree(subRoot, root)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean sameTree(TreeNode c, TreeNode p){
        if (c == null  && p == null) return true;
        
        if (c != null && p != null && c.val == p.val){
            return sameTree(c.left, p.left) && sameTree(c.right, p.right);
        }
        return false;
    }
}
