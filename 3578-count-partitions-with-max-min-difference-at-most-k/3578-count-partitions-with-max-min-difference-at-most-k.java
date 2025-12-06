class Solution {
    public int countPartitions(int[] nums, int k) {
        int mod=1000000007;
        int n=nums.length;
        int dp[]=new int[n+1];
        dp[0]=1;
        TreeMap<Integer,Integer> ms=new TreeMap<>();
        long cnt=1;
        int l=0;
        for(int r=0;r<n;r++){
            ms.put(nums[r],ms.getOrDefault(nums[r],0)+1);
            while(!ms.isEmpty() && ms.lastKey()-ms.firstKey()>k){
                cnt=(cnt-dp[l])%mod;
                if(cnt<0) cnt+=mod;
                int val=nums[l];
                if(ms.get(val)==1) ms.remove(val);
                else ms.put(val,ms.get(val)-1);
                l++;
            }
            dp[r+1]=(int)(cnt%mod);
            cnt=(cnt+dp[r+1])%mod;
        }
        return dp[n];
    }
}