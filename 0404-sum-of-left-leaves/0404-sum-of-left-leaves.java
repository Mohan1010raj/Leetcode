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
    
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,false);
    }
    int dfs(TreeNode root,boolean flag){
        if(root==null) return 0;

        if(root.left==null && root.right==null){
            return flag==true? root.val:0;
        }
        int sum=dfs(root.left,true)+dfs(root.right,false);
        return sum;
    }
}