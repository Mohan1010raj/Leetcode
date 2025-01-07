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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> l=new ArrayList<>();
        if(root!=null) preorder(root,l);
        Collections.sort(l);
        int sum=0;
        for(int i=0;i<l.size();i++){
            int val=l.get(i);
            if(val>=low && val<=high){
                sum+=val;
            }
        }
        return sum;
    }
    void preorder(TreeNode root,List<Integer> l){
        if(root==null) return;
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);
    }
}