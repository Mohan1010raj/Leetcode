class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        int prev[]=new int[m];
        
        for(int i=0;i<n;i++){
            int curr[]=new int[m];
            for(int j=0;j<m;j++){
                if(i==0 && j==0) curr[j]=grid[i][j];
                
                else{
                    int up=grid[i][j];
                    if(i>0) up=grid[i][j]+prev[j];
                    else up=Integer.MAX_VALUE;

                    int left=grid[i][j];
                    if(j>0) left=grid[i][j]+curr[j-1];
                    else left=Integer.MAX_VALUE;

                    curr[j]=Math.min(up,left);
                }
            }
            prev=curr;
        }
        return prev[m-1];
    }
}