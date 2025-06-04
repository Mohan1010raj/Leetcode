class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                int val=m.get(nums[i])+m.get(nums[i+1]);
                max=Math.max(max,val);
            }
        }
        return max;
    }
}