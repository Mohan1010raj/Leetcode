class Solution {
    public int minimumTotal(List<List<Integer>> l) {
        int n=l.size();
        //space optimization
        int front[]=new int[n];
        int curr[]=new int[n];
        for(int j=0;j<n;j++) front[j]=l.get(n-1).get(j);

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=l.get(i).get(j)+front[j];
                int dg=l.get(i).get(j)+front[j+1];

                curr[j]=Math.min(d,dg);
            }
            front=curr.clone();
        }
        return front[0];


        //tabulation method

        // int dp[][]=new int[n][n];
        // for(int j=0;j<n;j++) dp[n-1][j]=l.get(n-1).get(j);

        // for(int i=n-2;i>=0;i--){
        //     for(int j=i;j>=0;j--){
        //         int d=l.get(i).get(j)+dp[i+1][j];
        //         int dg=l.get(i).get(j)+dp[i+1][j+1];

        //         dp[i][j]=Math.min(d,dg);
        //     }
        // }
        // return dp[0][0];
    }
    
}