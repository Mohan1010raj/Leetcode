class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int diff=(max-k)-(min+k);
        if(diff<0) return 0;
        return diff;
    }
}