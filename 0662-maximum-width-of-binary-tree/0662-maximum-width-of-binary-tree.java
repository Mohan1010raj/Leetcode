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
        int ind;
        Pair(TreeNode node,int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));

        int maxWidth=0;

        while(!q.isEmpty()){
            int size=q.size();
            int st=q.peek().ind;
            int end=0;

            for(int i=0;i<size;i++){
                TreeNode tmp=q.peek().node;
                int pos=q.peek().ind;
                q.remove();
                end=pos;

                if(tmp.left!=null) q.add(new Pair(tmp.left,pos*2));
                if(tmp.right!=null) q.add(new Pair(tmp.right,pos*2+1));
            }
            maxWidth=Math.max(maxWidth,end-st+1);
        }
        return maxWidth;
    }
}