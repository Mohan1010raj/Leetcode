class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int odd=0,even=1;
        int cnt=0;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum%2==0){
                cnt=(cnt+odd)%mod;
                even++;
            }
            else{
                cnt=(cnt+even)%mod;
                odd++;
            }
        }
        return cnt;
    }
}