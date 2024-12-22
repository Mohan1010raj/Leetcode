class Solution {
    public int pivotIndex(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++){
            int l=0;
            int r=0;
            for(int j=0;j<i;j++){
                l+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++){
                r+=nums[j];
            }
            if(l==r){
                res=i;
                break;
            }
        }
        return res;
    }
}