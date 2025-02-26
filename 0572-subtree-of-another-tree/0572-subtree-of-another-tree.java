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
        if(root==null) return false;
        return dfs(root,subRoot);
    }
    boolean dfs(TreeNode root,TreeNode subRoot){
        if(root==null) return false;
        if(dfs1(root,subRoot)) return true;
        return dfs(root.left,subRoot) || dfs(root.right,subRoot);
    }
    
    boolean dfs1(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;

        if(root.val!=subRoot.val) return false;
        return dfs1 (root.left,subRoot.left) && dfs1(root.right,subRoot.right);
    }
}