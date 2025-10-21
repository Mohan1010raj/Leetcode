class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if(nums.length<=(k*2)+1) return nums.length;
        Arrays.sort(nums);
        long curr=Long.MIN_VALUE;
        int res=0;

        for(int num:nums){
            long t=Math.max(curr+1,num-k);
            if(t<=num+k){
                curr=t;
                res++;
            }
            else{
                curr=Math.max(curr,num);
            }
        }
        return res;
    }
}