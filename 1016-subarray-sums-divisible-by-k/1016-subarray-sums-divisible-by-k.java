class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt=0;
        int prefix=0;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int num:nums){
            prefix+=num;
            int mod=prefix%k;
            if(mod<0){
                mod+=k;
            }
            if(m.containsKey(mod)){
                cnt+=m.get(mod);
                m.put(mod,m.getOrDefault(mod,0)+1);
            }
            else{
                m.put(mod,1);
            }
        }
        return cnt;
    }
}