class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length/2;
        int len=nums[nums.length-1]+1;
        int tmp[]=new int[len];
        for(int i:nums){
            tmp[i]+=1;
        }
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]==n){
                return i;
            }
        }
        return 0;
    }
}