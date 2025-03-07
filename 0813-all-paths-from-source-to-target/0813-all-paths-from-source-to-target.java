class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length;
        int vis[]=new int[n];
        vis[0]=1;
        List<Integer> l=new ArrayList<>();
        l.add(0);
        dfs(0,vis,graph,n-1,l);
        return res;
    }
    void dfs(int st,int vis[],int mat[][],int tar,List<Integer> l){
        if(st==tar) {
            res.add(new ArrayList<>(l));
        }
        for(int i:mat[st]){
            if(vis[i]==0){
                vis[i]=1;
                l.add(i);
                dfs(i,vis,mat,tar,l);
            }
        }
        vis[st]=0;
        l.remove(l.size()-1);
    }
}