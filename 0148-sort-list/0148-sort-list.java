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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        List<Integer> l=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            l.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(l);
        head=null;
        head=new ListNode(l.get(0));
        curr=head;
        for(int i=1;i<l.size();i++){
            curr.next=new ListNode(l.get(i));
            curr=curr.next;
        }
        return head;




        // ListNode t=head;
        // while(t!=null){
        //     ListNode min=t;
        //     ListNode p=t.next;
        //     while(p!=null){
        //         if(p.val<min.val){
        //             min=p;
        //         }
        //         p=p.next;
        //     }
        //     int temp=t.val;
        //     t.val=min.val;
        //     min.val=temp;
        //     t=t.next;
        // }
        
        // return head;
    }
}