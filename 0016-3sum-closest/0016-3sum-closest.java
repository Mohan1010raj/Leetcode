class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==target){
                    res=sum;
                    
                }
                int diff=Math.abs(sum-target);

                if(diff<min){
                    min=diff;
                    res=sum;
                }
                if(min==diff && res<sum){
                    res=sum;
                }
                if(sum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }
}