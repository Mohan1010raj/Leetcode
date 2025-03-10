class Solution {
    public int uniquePaths(int m, int n) {

        int dp[]=new int[n];
        for(int i=0;i<m;i++){
            int curr[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0) curr[0]=1;
                else{
                    int up=0;
                    int left=0;
                    if(i>0) up=dp[j];
                    if(j>0) left=curr[j-1];
                    curr[j]=up+left;
                }
            }
            dp=curr;
        }
        return dp[n-1];



        // int dp[][]=new int[m][n];
        // for(int i=m-1;i>=0;i--){
        //     for(int j=n-1;j>=0;j--){
        //         if(i==m-1 || j==n-1){
        //             dp[i][j]=1;
        //         }
        //         else{
        //             dp[i][j]=dp[i+1][j]+dp[i][j+1];
        //         }
        //     }
        // }
        // return dp[0][0];
    }
}