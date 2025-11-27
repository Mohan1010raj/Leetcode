class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long res=Long.MIN_VALUE;
        long pref[]=new long[n+1];
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums[i];
        }
        long best[]=new long[k];
        boolean seen[]=new boolean[k];

        for(int i=0;i<=n;i++){
            int mod=i%k;
            if(seen[mod]){
                res=Math.max(res,pref[i]-best[mod]);
            }
            if(!seen[mod]) {
                best[mod]=pref[i];
                seen[mod]=true;
            }else{
                best[mod]=Math.min(best[mod],pref[i]);
            }
        }
        return res;
    }
}