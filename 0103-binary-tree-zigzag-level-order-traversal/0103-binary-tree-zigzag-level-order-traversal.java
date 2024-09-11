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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> st1=new Stack<>();
        Stack<TreeNode> st2=new Stack<>();
        boolean dir=true;
        st1.push(root);
        while(!st1.isEmpty()){
            List<Integer> level=new ArrayList<>();
            while(!st1.isEmpty()){
                TreeNode p=st1.pop();
                level.add(p.val);
                if(dir){
                    if(p.left!=null){
                        st2.push(p.left);
                    }
                    if(p.right!=null){
                        st2.push(p.right);
                    }
                }
                else{
                    if(p.right!=null){
                        st2.push(p.right);
                    }
                    if(p.left!=null){
                        st2.push(p.left);
                    }
                }
            }
            res.add(level);
            if(st1.isEmpty()){
                dir = !dir;
                Stack<TreeNode> temp=st1;
                st1=st2;
                st2=temp;
            }
        }
        return res;
    }
}