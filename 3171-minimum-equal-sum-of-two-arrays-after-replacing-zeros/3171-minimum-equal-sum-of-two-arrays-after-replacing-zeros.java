class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long num1zero=0;
        long num2zero=0;
        long sum1=0;
        long sum2=0;

        for(int i:nums1){
            if(i==0) num1zero++;
            sum1+=i;
        }
        for(int i:nums2){
            if(i==0) num2zero++;
            sum2+=i;
        }
        long min1=sum1+num1zero;
        long min2=sum2+num2zero;

        if(num1zero==0 && num2zero==0){
            return sum1==sum2 ? sum1:-1;
        }
        else if(num1zero==0){
            return num2zero+sum2<=sum1 ? sum1:-1;
        }
        else if(num2zero==0){
            return num1zero+sum1<=sum2 ? sum2:-1;
        }
        return Math.max(min1,min2);
    }
}