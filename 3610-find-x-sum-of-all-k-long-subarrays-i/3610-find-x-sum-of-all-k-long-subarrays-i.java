class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<=n-k;i++){
            Map<Integer,Integer> m=new HashMap<>();
            for(int j=i;j<i+k;j++){
                m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            }
            List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
            l.sort((a,b)->{
                if(a.getValue()==b.getValue()){
                    return b.getKey()-a.getKey();
                }
                return b.getValue()-a.getValue();
            });
            int len=1;
            int sum=0;
            for(Map.Entry<Integer,Integer> entry:l){
                if(len>x) break;
                int key=entry.getKey();
                int val=entry.getValue();
                for(int j=0;j<val;j++){
                    sum+=key;
                }
                len++;
            }
            ans[i]=sum;
        }
        return ans;
    }
}