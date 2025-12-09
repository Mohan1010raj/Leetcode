class Solution {
    public int specialTriplets(int[] nums) {
        int mod=1000000007;
        Map<Integer,Integer> after=new HashMap<>();
        Map<Integer,Integer> prev=new HashMap<>();
        for(int num:nums){
            after.put(num,after.getOrDefault(num,0)+1);
        }
        long cnt=0;
        for(int num:nums){
            int val=num*2;

            after.put(num,after.getOrDefault(num,0)-1);
            if(after.get(num)==0){
                after.remove(num);
            }
            
            if(prev.containsKey(val) && after.containsKey(val)){
                long prev_cnt=prev.get(val);
                long after_cnt=after.get(val);
                cnt=(cnt+(prev_cnt*after_cnt)%mod)%mod;
            }
            
            prev.put(num,prev.getOrDefault(num,0)+1);   
        }
        return (int)cnt;
    }
}