class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int res1[]=new int[n];
        res1[0]=0;
        int sum1=0;
        for(int i=1;i<n;i++){
            sum1=sum1+nums[i-1];
            res1[i]=sum1;
        }
        int res2[]=new int[n];
        res2[n-1]=0;
        int sum2=0;
        for(int i=n-1;i>0;i--){
            sum2=sum2+nums[i];
            res2[i-1]=sum2;
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=Math.abs(res1[i]-res2[i]);
        }
        return res;
    }
}