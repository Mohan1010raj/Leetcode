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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode p=root;
        while(p!=null){
            if(p.val<val && p.right!=null){
                p=p.right;
            }
            else if(p.val>val && p.left!=null){
                p=p.left;
            }
            else if(p.val<val && p.right==null){
                p.right=new TreeNode(val);
                break;
            }
            else if(p.val>val && p.left==null){
                p.left=new TreeNode(val);
                break;
            }

        }
        return root;
    }
}