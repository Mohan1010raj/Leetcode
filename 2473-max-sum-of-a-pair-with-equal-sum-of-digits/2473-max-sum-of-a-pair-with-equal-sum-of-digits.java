class Solution {
    public int maximumSum(int[] nums) {

        int arr[]=new int[82];
        int ans=-1;
        for(int num:nums){
            int sum=0;
            int tmp=num;
            while(num!=0){
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            if(arr[sum]!=0){
                ans=Math.max(ans,tmp+arr[sum]);
            }
            arr[sum]=Math.max(arr[sum],tmp);
        }
        return ans;




    //     int n=nums.length;
    //     int max=-1;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             int val1=sum(nums[i]);
    //             int val2=sum(nums[j]);
    //             if(val1==val2){
    //                 int total=nums[i]+nums[j];
    //                 max=Math.max(max,total);
    //             }
    //         }
    //     }
    //     return max;
    // }
    // int sum(int num){
    //     int s=0;
    //     while(num!=0){
    //         int digit=num%10;
    //         s+=digit;
    //         num/=10;
    //     }
    //     return s;
    }
}