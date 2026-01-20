class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            int val=nums.get(i);
            boolean f=false;
            for(int x=0;x<=val;x++){
                if((x|(x+1))==val){
                    ans[i]=x;
                    f=true;
                    break;
                }
            }
            if(!f){
                ans[i]=-1;
            }
        }
        return ans;
    }
}