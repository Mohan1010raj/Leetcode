class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int total=0;
        for(int i=0;i<m;i++){
            Arrays.sort(grid[i]);
        }
        for(int col=0;col<n;col++){
            int max=0;
            for(int row=0;row<m;row++){
                max=Math.max(max,grid[row][n-1-col]);
            }
            total+=max;
        }
        return total;
    }
}