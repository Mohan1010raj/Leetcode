class Solution {
    private static void dfs(int node,List<List<Integer>> l,int vis[]){
        vis[node]=1;
        for(Integer i:l.get(node)){
            if(vis[i]==0){
                dfs(i,l,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    l.get(i).add(j);
                    l.get(j).add(i);
                }
            }
        }
        int vis[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
                dfs(i,l,vis);
            }
        }
        return count;
    }
}