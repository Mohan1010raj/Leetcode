class Solution {
    public int minimumTotal(List<List<Integer>> l) {
        int n=l.size();
        int dp[][]=new int[n][n];
        for(int j=0;j<n;j++) dp[n-1][j]=l.get(n-1).get(j);

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=l.get(i).get(j)+dp[i+1][j];
                int dg=l.get(i).get(j)+dp[i+1][j+1];

                dp[i][j]=Math.min(d,dg);
            }
        }
        return dp[0][0];
    }
    
}