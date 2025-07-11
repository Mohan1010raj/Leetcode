class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Set<List<Integer>> res=new HashSet<>();

        List<Integer> ds=new ArrayList<>();
        Arrays.sort(arr);
        dfs(0,arr,t,res,ds);
        List<List<Integer>> ans=new ArrayList<>(res);
        return ans;
    }
    void dfs(int ind,int arr[],int t,Set<List<Integer>> res,List<Integer> ds){
        if(t==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>t) break;
            ds.add(arr[i]);
            dfs(i+1,arr,t-arr[i],res,ds);
            ds.remove(ds.size()-1);
        }
        
    }
}