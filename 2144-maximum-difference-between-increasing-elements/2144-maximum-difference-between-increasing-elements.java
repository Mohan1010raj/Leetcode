class Solution {
    public int maximumDifference(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[j]-nums[i]);
            }
        }
        if(max<=0) return -1;
        return max;
    }
}