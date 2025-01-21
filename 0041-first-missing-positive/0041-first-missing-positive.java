class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=1;i<max;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        if(max>0){
            return max+1;
        }
        else{
            return 1;
        }
    }
}