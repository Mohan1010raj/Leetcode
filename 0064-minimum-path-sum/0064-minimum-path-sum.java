class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) dp[i][j]=grid[i][j];
                
                else{
                    int up=grid[i][j];
                    if(i>0) up=grid[i][j]+dp[i-1][j];
                    else up=Integer.MAX_VALUE;

                    int left=grid[i][j];
                    if(j>0) left=grid[i][j]+dp[i][j-1];
                    else left=Integer.MAX_VALUE;

                    dp[i][j]=Math.min(up,left);
                }
            }
        }
        return dp[n-1][m-1];
    }
}