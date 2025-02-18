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
    Set<Integer> set=new HashSet<>();
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return 0;

        findSecondMinimumValue(root.left);
        set.add(root.val);
        findSecondMinimumValue(root.right);

        List<Integer> l=new ArrayList<>(set);
        Collections.sort(l);
        if(l.size()>1){
            return l.get(1);
        }
        
        return -1;
    }
}