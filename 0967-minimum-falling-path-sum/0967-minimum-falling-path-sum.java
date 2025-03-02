class Solution {
    public int minFallingPathSum(int[][] mat) {
        int n=mat.length;
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++) dp[n-1][j]=mat[n-1][j];

        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int d=mat[i][j]+dp[i+1][j];
                int ld=Integer.MAX_VALUE;
                int rd=Integer.MAX_VALUE;
                if(j>0) ld=mat[i][j]+dp[i+1][j-1];
                if(j<n-1) rd=mat[i][j]+dp[i+1][j+1];

                dp[i][j]=Math.min(d,Math.min(ld,rd));
            }
        }
        int min=dp[0][0];
        for(int j=1;j<n;j++){
            min=Math.min(min,dp[0][j]);
        }
        return min;
    }
}