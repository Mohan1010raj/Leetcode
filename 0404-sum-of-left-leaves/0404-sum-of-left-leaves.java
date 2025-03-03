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
    class Pair{
        TreeNode node;
        boolean flag;
        Pair(TreeNode node,boolean flag){
            this.node=node;
            this.flag=flag;
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,false));
        int sum=0;

        while(!q.isEmpty()){
            TreeNode node1=q.peek().node;
            boolean flag1=q.peek().flag;
            q.remove();

            if(flag1==true && node1.left==null && node1.right==null){
                sum+=node1.val;
            }

            if(node1.left!=null){
                q.add(new Pair(node1.left,true));
            }
            if(node1.right!=null){
                q.add(new Pair(node1.right,false));
            }
        }
        return sum;
    }
}