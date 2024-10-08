class Solution {
    public int jump(int[] nums) {
        if(nums.length==1)
            return 0;
        int n=nums.length;
        int max=0;
        int current=0;
        int jump=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,i+nums[i]);
            if(i==current){
                jump++;
                current=max;
            }
            if(current>=n-1){
                break;
            }
        }
        return jump;
    }
}