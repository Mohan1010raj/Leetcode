class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int R=grid.length, C=grid[0].length;
        if(R<3 || C<3) return 0;

        int p[][]={
            {8,1,6,3,5,7,4,9,2},{6,1,8,7,5,3,2,9,4},
            {4,9,2,3,5,7,8,1,6},{2,9,4,7,5,3,6,1,8},
            {8,3,4,1,5,9,6,7,2},{4,3,8,9,5,1,2,7,6},
            {6,7,2,1,5,9,8,3,4},{2,7,6,9,5,1,4,3,8}
        };

        int cnt=0;
        for(int r=0;r<R-2;r++){
            for(int c=0;c<C-2;c++){
                if(grid[r+1][c+1]!=5) continue;
                if(matches(grid,r,c,p)) cnt++;
            }
        }
        return cnt;
    }
    boolean matches(int grid[][], int r, int c, int[][] p){
        int s[]={
            grid[r][c],grid[r][c+1],grid[r][c+2],
            grid[r+1][c],grid[r+1][c+1],grid[r+1][c+2],
            grid[r+2][c],grid[r+2][c+1],grid[r+2][c+2]
        };

        for(int arr[]:p){
            if(Arrays.equals(s,arr)) return true;
        }
        return false;
    }
}