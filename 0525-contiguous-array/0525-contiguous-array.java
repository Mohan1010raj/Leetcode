class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i] == 0 ? -1 : 1;
            if(sum==0) {
                ans=i+1;
            }
            else if(m.containsKey(sum)){
                int len=i-m.get(sum);
                ans=Math.max(ans,len);
            }
            else{
                m.put(sum,i);
            }
        }
        return ans;
    }
}