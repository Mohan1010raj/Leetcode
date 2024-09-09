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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        int m=0;
        while(p!=null){
            m+=1;
            p=p.next;
        }
        if(n==m){
            return head.next;
        }
        int s=m-n;
        ListNode c=head;
        
        for(int i=1;i<s;i++){
           c=c.next;
        }
        c.next=c.next.next;
        return head; 
    }
}