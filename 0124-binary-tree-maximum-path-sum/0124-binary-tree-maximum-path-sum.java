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
    private int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        path(root);
        return maxsum;
    }
    int path(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(0,path(root.left));
        int right=Math.max(0,path(root.right));

        maxsum=Math.max(maxsum,root.val+left+right);
        return root.val+Math.max(left,right);
    }
}