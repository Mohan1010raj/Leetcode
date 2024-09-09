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
class Solution {
    public ListNode middleNode(ListNode head) {
        int m=0;
        ListNode p=head;
        while(p!=null){
            m+=1;
            p=p.next;
        }
        int n=m/2;
        ListNode curr=head;
        for(int i=1;i<=n;i++){
            curr=curr.next;
        }
        return curr;
    }
}