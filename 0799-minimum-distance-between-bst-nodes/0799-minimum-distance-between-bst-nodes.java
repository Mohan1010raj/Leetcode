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
    public int minDiffInBST(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        if(root!=null) preorder(root,l);
        Collections.sort(l);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<l.size()-1;i++){
            int val=l.get(i+1)-l.get(i);
            if(val<diff){
                diff=val;
            }
        }
        return diff;
    }
    void preorder(TreeNode root,List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
    
    }
}