class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int c=1;
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]+1==nums[i+1]){
                c++;
                if(c>count){
                    count++;
                }
            }else{
                c=1;
            }
        }
        return count;
    }
}