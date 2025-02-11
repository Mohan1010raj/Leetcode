class Solution {
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int numEnclaves(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1 && (i==0 || i==n-1 || j==0 || j==m-1)){
                    q.add(new Pair(i,j));
                    vis[i][j]=1;
                }
            }
        }

        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();

            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 &&
                mat[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && mat[i][j]==1){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}