class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int res[]=new int[n2];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n2;i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                res[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        int ans[]=new int[n1];
        for(int i=0;i<n1;i++){
            int val=nums1[i];
            int ind=0;
            for(int j=0;j<n2;j++){
                if(nums2[j]==val){
                    ind=j;
                }
            }
            ans[i]=res[ind]==0?-1:res[ind];
        }
        return ans;
    }
}