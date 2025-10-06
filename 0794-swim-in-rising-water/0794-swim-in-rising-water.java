class Solution {
    class Pair{
        int d;
        int r,c;
        Pair(int d,int r,int c){
            this.d=d;
            this.r=r;
            this.c=c;
        }
    }
    public int swimInWater(int[][] grid) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
        pq.add(new Pair(grid[0][0],0,0));
        Set<String> set=new HashSet<>();
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};

        int n=grid.length;
        int m=grid[0].length;

        while(!pq.isEmpty()){
            int dis=pq.peek().d;
            int row=pq.peek().r;
            int col=pq.peek().c;
            pq.poll();

            String s=row+" "+col;
            if(set.contains(s)) continue;
            set.add(s);

            if(row==n-1 && col==m-1) return dis;

            for(int i=0;i<4;i++){
                int nrow=row+drow[i];
                int ncol=col+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !set.contains(nrow+" "+ncol)){
                    pq.add(new Pair(Math.max(grid[nrow][ncol],dis),nrow,ncol));
                }
            }
        }
        return -1;
    }
}