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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    static TreeNode helper(int nums[],int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.right=helper(nums,mid+1,end);
        root.left=helper(nums,st,mid-1);
        return root;
    }
}