class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        int c=0;
        int max=Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c+=1;
            }
            else{
                c=0;
            }
            if(c>max){
                max=c;
                res=nums[i];
            }
        }
        return res;
    }
}