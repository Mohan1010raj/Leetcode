class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
                max=Math.max(max,sum);
            }
            else{
                sum+=nums[i];
                max=Math.max(max,sum);
                sum=0;
            }
        }
        if(nums[n-1]>nums[n-2]){
            sum+=nums[n-1];
            max=Math.max(max,sum);
        }
        return max;
    }
}