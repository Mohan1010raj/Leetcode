class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;
        }
        int res[]=new int[nums.length];
        int cnt=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                res[i]=res[i-1]+1;
                cnt+=res[i];
            }
        }
        return cnt;
    }
}