class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();

        dfs(nums,0,res,sub);
        return res;
    }
    void dfs(int nums[],int index,List<List<Integer>> res, List<Integer> sub){
        if(index==nums.length){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        dfs(nums,index+1,res,sub);

        sub.remove(sub.size()-1);
        dfs(nums,index+1,res,sub);
    }
}