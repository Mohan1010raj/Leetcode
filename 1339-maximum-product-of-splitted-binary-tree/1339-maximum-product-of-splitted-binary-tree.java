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
    long total=0, max_sum=0;
    int mod=1000000007;
    public int maxProduct(TreeNode root) {
        total=sum(root);
        dfs(root);
        return (int)(max_sum%mod);
    }
    long sum(TreeNode root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    long dfs(TreeNode root){
        if(root==null) return 0;
        long sum=root.val+dfs(root.left)+dfs(root.right);
        max_sum=Math.max(max_sum,sum*(total-sum));
        return sum;
    }
}