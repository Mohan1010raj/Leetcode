class Solution {
    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    private void bfs(int i,int j,int[][] vis,char grid[][],int[] delRow,int[] delCol){
        vis[i][j]=1;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(i,j));

        int n=grid.length;
        int m=grid[0].length;

        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();

            for(int x=0;x<4;x++){
                int nrow=row+delRow[x];
                int ncol=col+delCol[x];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && 
                vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Pair(nrow,ncol));
                }
            }

        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int vis[][]=new int[n][m];
        int delRow[]={-1,0,+1,0};
        int delCol[]={0,+1,0,-1};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    cnt++;
                    bfs(i,j,vis,grid,delRow,delCol);
                }
            }
        }
        return cnt;
    }
}