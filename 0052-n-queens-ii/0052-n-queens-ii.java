class Solution {
    static int cnt=0;
    public int totalNQueens(int n) {
        // if(n==1) return 1;
        // else if(n==2) return 0;
        // else if(n==3) return 0;
        // else if(n==4) return 2;
        // else if(n==5) return 10;
        // else if(n==6) return 4;
        // else if(n==7) return 40;
        // else if(n==8) return 92;
        // else if(n==9) return 352;
        // return n;
        
        return solveNQueens(n);
    }
    public static int solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList<>();
        dfs(0,board,res);
        cnt=res.size();
        return cnt;
    }
    static void dfs(int col,char[][] board,List<List<String>> res){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(row,col,board)){
                board[row][col]='Q';
                dfs(col+1,board,res);
                board[row][col]='.';
            }
        }
    }
    static List<String> construct(char[][] board){
        List<String> s=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String ss=new String(board[i]);
            s.add(ss);
        }
        return s;
    }
    static boolean validate(int row,int col,char[][] board){
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(row<board.length && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return true;
    }
}