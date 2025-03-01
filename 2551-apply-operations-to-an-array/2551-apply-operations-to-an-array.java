class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        List<Integer> num=new ArrayList<>();
        for(int i:nums){
            if(i!=0) num.add(i);
        }
        int res[]=new int[n];
        for(int i=0;i<num.size();i++){
            res[i]=num.get(i);
        }
        return res;
    }
}