class Solution {
    public int consecutiveNumbersSum(int n) {
        int res=1;
        int i=1;
        int sum=0;
        while(sum<n){
            sum+=i;
            if((n-sum)>0 && (n-sum)%(i+1)==0){
                res++;
            }
            i++;
        }
        return res;
    }
}