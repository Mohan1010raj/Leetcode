class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int res=0,cnt=1,prev=0;
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)>nums.get(i-1)){
                cnt++;
            }
            else{
                prev=cnt;
                cnt=1;
            }
            res=Math.max(res,Math.max((cnt/2),Math.min(cnt,prev)));
        }
        return res;
    }
}