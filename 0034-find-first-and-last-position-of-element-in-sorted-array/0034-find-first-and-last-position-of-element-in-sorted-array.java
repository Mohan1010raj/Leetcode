class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        int n=nums.length;
        res[0]=first(nums,n,target);
        res[1]=last(nums,n,target);
        return res;
    }
    int first(int nums[],int n,int t){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==t){
                ans=m;
                e=m-1;
            }
            else if(nums[m]>t){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
    int last(int nums[],int n,int t){
        int s=0;
        int e=n-1;
        int ans=-1;
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==t){
                ans=m;
                s=m+1;
            }
            else if(nums[m]>t){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;
    }
}