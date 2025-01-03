class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long total=0;
        for(int val:nums){
            total+=val;
        }
        long left=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            long right=total-left;
            if(left>=right){
                c++;
            }
        }
        return c;
    }
}