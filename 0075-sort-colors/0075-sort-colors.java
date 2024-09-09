class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int n=nums.length;
        for(int x:nums){
            if(x==0) zeros++;
            else if(x==1) ones++;
        } 
        for(int i=0;i<zeros;i++){
            nums[i]=0;
        }
        for(int i=zeros;i<zeros+ones;i++){
            nums[i]=1;
        }
        for(int i=zeros+ones;i<n;i++){
            nums[i]=2;
        }
    }
}