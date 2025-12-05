class Solution {
    public int countPartitions(int[] nums) {
        int t=0;
        for(int num:nums){
            t+=num;
        }
        int sum=0;
        int cnt=0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            int diff=sum-(t-sum);
            if(diff%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}