class Solution {
    int max=0;
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int row,int col,int vis[][],int grid[][],int delrow[],int delcol[]){
        vis[row][col]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(row,col));
        int n=grid.length;
        int m=grid[0].length;

        int cnt=0;
        while(!q.isEmpty()){
            int row1=q.peek().first;
            int col1=q.peek().second;
            q.remove();
            cnt++;

            for(int i=0;i<4;i++){
                int nrow=row1+delrow[i];
                int ncol=col1+delcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol));
                    vis[nrow][ncol]=1;
                }
            }
        }
        max=Math.max(max,cnt);

    }

    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int delrow[]={-1,0,+1,0};
        int delcol[]={0,+1,0,-1};
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]==1){
                    bfs(row,col,vis,grid,delrow,delcol);
                }
            }
        }
        return max;
    }
}