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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new ArrayDeque<TreeNode>();
        List<List<Integer>> l1=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l2=new ArrayList<>();
            int size=q.size();
            
            for(int i=0;i<size;i++){
                TreeNode p=q.poll();
                l2.add(p.val);
                if(p.left!=null){
                    q.add(p.left);
                }
                if(p.right!=null){
                    q.add(p.right);
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}