class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row=matrix.length;
        int column=matrix[0].length;
        int res[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				if(matrix[i][j]==-1 || matrix[i][j]==Integer.MIN_VALUE ) {
					int max=Integer.MIN_VALUE;
					int l=0;
					while(l<row) {
						if(matrix[l][j]>max && matrix[l][j]!=-1 && matrix[l][j]!=Integer.MIN_VALUE) {
							max=matrix[l][j];
						}
						l++;
					}
					res[i][j]=max;
				}else {
					res[i][j]=matrix[i][j];
				}
			}
		}
        return res;
    }
}