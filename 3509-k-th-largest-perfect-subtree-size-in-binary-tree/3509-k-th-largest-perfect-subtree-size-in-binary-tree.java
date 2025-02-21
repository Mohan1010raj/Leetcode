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
        boolean key;
        int val;
        Pair(boolean key,int val){
            this.key=key;
            this.val=val;
        }
    }
    List<Integer> res=new ArrayList<>();

    Pair check(TreeNode root){
        if(root==null) return new Pair(true,0);

        Pair l=check(root.left);
        Pair r=check(root.right);

        if(l.key && r.key && l.val==r.val){
            int s=l.val+r.val+1;

            res.add(s);
            return new Pair(true,s);
        }
        return new Pair(false,0);
    }

    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        if(root==null) return -1;

        check(root);

        Collections.sort(res, Collections.reverseOrder());

        if(res.size()>=k){
            return res.get(k-1);
        }
        return -1;
    }
}