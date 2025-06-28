class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            Set<Character> row=new HashSet<>();
            Set<Character> col=new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[i][j]!='.'){
                    if(!row.add(board[i][j])) return false;
                }
                if(board[j][i]!='.'){
                    if(!col.add(board[j][i])) return false;
                }
            }
        }

        for(int x=0;x<9;x++){
            Set<Character> box=new HashSet<>();
            int row=3*(x/3);
            int col=3*(x%3);
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    char c=board[i+row][j+col];
                    if(c!='.'){
                        if(!box.add(c)) return false;
                    }
                }
            }
        }
        
        return true;
    }
}