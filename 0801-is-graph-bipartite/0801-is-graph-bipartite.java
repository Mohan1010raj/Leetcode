class Solution {
    private boolean check(int st,int n,int[][] graph,int [] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(st);
        color[st]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i:graph[node]){
                if(color[i]==-1){
                    color[i]=1-color[node];
                    q.add(i);
                }
                else if(color[i]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(check(i,n,graph,color)==false){
                    return false;
                }
            }
        }
        return true;
    }
}