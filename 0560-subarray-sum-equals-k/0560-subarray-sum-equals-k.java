class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int remove=prefix-k;
            cnt+=m.getOrDefault(remove,0);
            m.put(prefix,m.getOrDefault(prefix,0)+1);
        }
        return cnt;








        // int cnt=0;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum==k){
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;
    }
}