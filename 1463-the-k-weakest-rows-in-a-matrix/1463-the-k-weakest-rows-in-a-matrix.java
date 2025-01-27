class Solution {
    class Pair{
        int Key;
        int Value;
        Pair(int Key,int Value){
            this.Key=Key;
            this.Value=Value;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b) -> {
            if(a.Value==b.Value){
                return a.Key-b.Key;
            }
            return a.Value - b.Value;
        });
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            pq.add(new Pair(i,cnt));
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            Pair ele=pq.poll();
            res[i]=ele.Key;
        }
        return res;
    }
}