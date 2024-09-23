class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int row=mat.length;
		for(int i=0;i<row;i++) {
			sum+=mat[i][i];
		}
		for(int i=0;i<row;i++) {
			if(i!=row-i-1) {
				sum+=mat[i][row-i-1];
			}
		}
        return sum;
    }
}