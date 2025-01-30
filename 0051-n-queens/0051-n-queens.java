class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList<>();
        dfs(0,board,res);
        return res;
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