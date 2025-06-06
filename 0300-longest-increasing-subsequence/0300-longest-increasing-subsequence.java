class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        return f(0,-1,nums,dp);
    }
    int f(int ind,int prev,int nums[],int dp[][]){
        if(ind==nums.length) return 0;

        if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];

        int len=f(ind+1,prev,nums,dp);
        if(prev==-1 || nums[ind]>nums[prev]){
            len=Math.max(len,1+f(ind+1,ind,nums,dp));
        }
        return dp[ind][prev+1]=len;
    }
}