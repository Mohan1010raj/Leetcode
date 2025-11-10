class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st =new Stack<>();
        int res=0;

        for(int num:nums){
            while(!st.isEmpty() && st.peek()>num){
                st.pop();
            }

            if(num>0 && (st.isEmpty() || num!=st.peek())){
                st.push(num);
                res++;
            }
        }
        return res;
    }
}