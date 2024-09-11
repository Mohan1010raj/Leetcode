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
    public boolean isPalindrome(ListNode head) {
        int m=0;
        ListNode p=head;
        while(p!=null){
            m+=1;
            p=p.next;
        }
        int a[]=new int[m];
        int l=0;
        ListNode curr=head;
        while(curr!=null){
            a[l++]=curr.val;
            curr=curr.next;
        }
        int i=0;
        int j=m-1;
        while(i<j){
            if(a[i]!=a[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}