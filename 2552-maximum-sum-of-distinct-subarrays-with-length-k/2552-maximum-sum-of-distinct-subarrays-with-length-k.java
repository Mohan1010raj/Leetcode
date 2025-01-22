class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        long maxsum=Integer.MIN_VALUE;
        while(i<=nums.length-k)
        {
            if(!set.contains(nums[j]) && j-i<k)
            {
                set.add(nums[j]);
                sum=sum+nums[j];
                j++;
                if(set.size()==k && j-i==k)
                {
                    maxsum=(long)Math.max(sum,maxsum);
                    sum=sum-nums[i];
                    set.remove(nums[i]);
                    i++;
                }
            }
            else
            {
                set.clear();
                i=i+1;
                j=i;
                sum=0;
            }
        }
        if(maxsum!=Integer.MIN_VALUE)
        {
            return (long)Math.max(sum,maxsum);
        }
        return 0;
    }
}