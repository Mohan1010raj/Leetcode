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
    int res=0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,0);
        return res;
    }
    void dfs(TreeNode root,int val){
        if(root==null) return;

        val=val<<1 | root.val;
        if(root.left==null && root.right==null){
            res+=val;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
}