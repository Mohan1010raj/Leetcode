class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int c=0;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==k){
                c++;
                l++;
                r--;
            }
            else if(sum>k){
                r--;
            }
            else{
                l++;
            }
        }
        return c;
    }
}