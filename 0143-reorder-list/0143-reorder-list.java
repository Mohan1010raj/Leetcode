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
    public void reorderList(ListNode head) {
        if(head==null) return;

        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode second=slow.next;
        slow.next=null;
        ListNode node=null;

        while(second!=null){
            ListNode t=second.next;
            second.next=node;
            node=second;
            second=t;
        }

        ListNode first=head;
        second=node;

        while(second!=null){
            ListNode t1=first.next, t2=second.next;
            first.next=second;
            second.next=t1;
            first=t1;
            second=t2;
        }
    }
    
}