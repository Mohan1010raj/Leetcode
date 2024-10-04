class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()==1){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}