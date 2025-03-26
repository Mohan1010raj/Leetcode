class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        
        int k=total;
        boolean dp[][]=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=k) dp[0][arr[0]]=true;
        
        for(int i=1;i<n;i++){
            for(int tar=1;tar<=k;tar++){
                boolean notTake=dp[i-1][tar];
                boolean take=false;
                if(arr[i]<=tar) take=dp[i-1][tar-arr[i]];
                dp[i][tar]=take || notTake;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=total/2;i++){
            if(dp[n-1][i]){
                min=Math.min(min,Math.abs(i-(total-i)));
                if(min==0){
                    return true;
                }
            }
        }
        return false;
    }
}