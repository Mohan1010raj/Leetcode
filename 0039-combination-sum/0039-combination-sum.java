class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>> res=new ArrayList<>();

        List<Integer> ds=new ArrayList<>();
        int sum=0;
        dfs(0,arr,t,res,ds,sum);
        return res;
    }
    void dfs(int i,int arr[],int t,List<List<Integer>> res,List<Integer> ds,int sum){
        if(sum==t){
            res.add(new ArrayList<>(ds));
            return;
        }
        if(sum>t || i>=arr.length){
            return;
        }
        ds.add(arr[i]);
        dfs(i,arr,t,res,ds,sum+arr[i]);
        ds.remove(ds.size()-1);
        dfs(i+1,arr,t,res,ds,sum);
    }
}