class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        int n=s.length();
        char mat[][]=new char[numRows][n];
        for(int i=0;i<mat.length;i++){
            Arrays.fill(mat[i],' ');
        }
        int row=0,col=0;
        boolean down=true;
        for(int i=0;i<s.length();i++){
            mat[row][col]=s.charAt(i);
            if(down){
                if(row<numRows-1){
                    row++;
                }
                else{
                    down=false;
                    row--;
                    col++;
                }
            }
            else{
                if(row>0){
                    row--;
                    col++;
                }
                else{
                    down=true;
                    row++;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=' '){
                    res.append(mat[i][j]);
                }
            }
        }
        return res.toString();
    }
}