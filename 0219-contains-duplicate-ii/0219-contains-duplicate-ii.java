class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                int index=m.get(nums[i]);
                m.put(nums[i],0);
                if(i-index<=k){
                    return true;
                }
                m.put(nums[i],i);
            }
            else{
                m.put(nums[i],i);
            }
        }
        return false;
    }
}