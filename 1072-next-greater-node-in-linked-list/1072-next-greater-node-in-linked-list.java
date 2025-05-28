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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l=new ArrayList<>();
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
        int n=l.size();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=l.get(i);
        }
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                res[st.pop()]=arr[i];
            }
            st.push(i);
        }
        return res;

    }
}