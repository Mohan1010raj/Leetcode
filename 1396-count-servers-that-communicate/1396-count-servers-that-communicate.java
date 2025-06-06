class Solution {
    int total;
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public int countServers(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]!=1 && grid[i][j]==1){
                    bfs(i,j,grid,vis);
                }
            }
        }
        return total;
    }
    void bfs(int i,int j,int grid[][],int vis[][]){
        int n=grid.length;
        int m=grid[0].length;

        int delrow[]={0,-1,0,1};
        int delcol[]={-1,0,1,0};

        Queue<Pair> q=new LinkedList<>();
        List<Pair> l=new ArrayList<>();
        q.add(new Pair(i,j));
        l.add(new Pair(i,j));
        vis[i][j]=1;

        while(!q.isEmpty()){
            int row=q.peek().row;
            int col=q.peek().col;
            q.remove();


            for(int k=0;k<m;k++){
                if(grid[row][k]==1 && vis[row][k]!=1){
                    vis[row][k]=1;
                    q.add(new Pair(row,k));
                    l.add(new Pair(row,k));
                }
            }
            for(int k=0;k<n;k++){
                if(grid[k][col]==1 && vis[k][col]!=1){
                    vis[k][col]=1;
                    q.add(new Pair(k,col));
                    l.add(new Pair(k,col));
                }
            }

            

            // for(int x=0;x<4;x++){
            //     int nrow=row+delrow[x];
            //     int ncol=col+delcol[x];
            //     if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
            //     grid[nrow][ncol]==1 && vis[nrow][ncol]!=1){
            //         cnt++;
            //         vis[nrow][ncol]=1;
            //         q.add(new Pair(nrow,ncol));
            //     }
            // }
        }
        // if(cnt>1){
        //     total+=cnt;
        // }

        if(l.size()>1){
            total+=l.size();
        }
    }
}