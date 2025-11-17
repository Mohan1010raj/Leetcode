class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ind=i;
                break;
            }
        }
        for(int i=ind+1;i<nums.length;i++){
            if(nums[i]==1){
                if(i-ind-1<k){
                    return false;
                }
                else{
                    System.out.println(i);
                    ind=i;
                }
            }
        }
        return true;
    }
}