class Solution {
    public int minOperations(int[] nums) {
        int res=0;
        int n=nums.length;
        int cnt=0;

        for(int num:nums){
            if(num==1) res++;
        }
        if(res>0) return n-res;

        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int g=nums[i];
            for(int j=i+1;j<n;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    ans=Math.min(ans,j-i);
                    break;
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans+n-1;
        
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
}