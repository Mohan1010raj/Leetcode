class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j]){
                    int vis[][]=new int[n][m];
                    if(dfs(i,j,vis,board,word,n,m,1)) return true;
                }
            }
        }
        return false;
    }
    boolean dfs(int i,int j,int vis[][],char board[][],String word,int n,int m,int ind){
        if(ind==word.length()) return true;
        vis[i][j]=1;
        int row[]={0,-1,0,1};
        int col[]={-1,0,1,0};
        for(int x=0;x<4;x++){
            int nrow=i+row[x];
            int ncol=j+col[x];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0
            && word.charAt(ind)==board[nrow][ncol]){
                if(dfs(nrow,ncol,vis,board,word,n,m,ind+1)) return true;
            }
        }
        vis[i][j]=0;
        return false;
    }
}