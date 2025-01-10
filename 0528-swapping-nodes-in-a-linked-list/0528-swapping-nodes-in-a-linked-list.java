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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p=head;
        int n=0;
        while(p!=null){
            n++;
            p=p.next;
        }
        int m=n-k;
        ListNode s=head;
        for(int i=1;i<k;i++){
            s=s.next;
        }
        ListNode e=head;
        for(int i=1;i<=m;i++){
            e=e.next;
        }
        int t=s.val;
        s.val=e.val;
        e.val=t;
        return head;
    }
}