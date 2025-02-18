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
    
    public int deepestLeavesSum(TreeNode root) {
        int hei=height(root);
        return sum(root,1,hei);
    }
    int height(TreeNode root){
        if(root==null) return 0;

        return 1+Math.max(height(root.left),height(root.right));
    }

    int sum(TreeNode root,int level,int hei){
        if(root==null) return 0;
        if(level==hei && root.left==null && root.right==null){
            return root.val;
        }

        return sum(root.left,level+1,hei) + sum(root.right,level+1,hei);
    }
}