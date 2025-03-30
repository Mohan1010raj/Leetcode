class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=i+1;j<n+i;j++){
                if(nums[j%n]>nums[i]){
                    res[i]=nums[j%n];
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                res[i]=-1;
            }
        }
        return res;
    }
}