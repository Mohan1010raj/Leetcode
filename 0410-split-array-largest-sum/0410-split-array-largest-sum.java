class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int max=0;
        for(int i:nums){
            sum+=i;
            max=Math.max(max,i);
        }
        int l=max;
        int r=sum;
        int res=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(largest(mid,nums,k)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
    boolean largest(int mid,int nums[],int k){
        int cnt=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>mid){
                cnt++;
                sum=nums[i];
            }
        }
        return cnt<k;
    }
}