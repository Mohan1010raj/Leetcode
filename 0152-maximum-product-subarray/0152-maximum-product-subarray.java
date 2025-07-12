class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int pro=1;
        for(int num:nums){
            pro*=num;
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        pro=1;
        for(int i=n-1;i>=0;i--){
            pro*=nums[i];
            max=Math.max(max,pro);
            if(pro==0){
                pro=1;
            }
        }
        return max;
    }
}