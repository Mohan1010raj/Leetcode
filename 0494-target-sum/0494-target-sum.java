class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return dfs(0,0,nums,target);
    }
    int dfs(int i,int sum,int nums[],int tar){
        if(i==nums.length){
            return sum==tar ? 1:0;
        }
        return dfs(i+1,sum+nums[i],nums,tar)+dfs(i+1,sum-nums[i],nums,tar);
    }
}