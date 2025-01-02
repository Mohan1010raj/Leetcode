/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode p=head;
        int n=0;
        while(p!=null){
            n++;
            p=p.next;
        }
        int arr[]=new int[n];
        int l=0;
        ListNode pp=head;
        while(pp!=null){
            arr[l]=pp.val;
            pp=pp.next;
            l++;
        }
        return helper(arr,0,arr.length-1);
    }
    static TreeNode helper(int arr[],int st,int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.right=helper(arr,mid+1,end);
        root.left=helper(arr,st,mid-1);
        return root;
    }
}