class Solution {
    public int integerReplacement(int n) {
        return helper((long)n);


        // if(Integer.MAX_VALUE==n) n--;
        // int cnt=0;
        // while(n!=1){
        //     if(n%2==0){
        //         n=n/2;
        //     }
        //     else if(n==3 || (n-1)%4==0){
        //         n--;
        //     }
        //     else{
        //         n++;
        //     }
        //     cnt++;
        // }
        // return cnt;
    }
    int helper(long n){
        if(n==1) return 0;
        if(n%2==0){
            return 1+helper(n/2);
        }
        else{
            return 1+Math.min(helper(n-1),helper(n+1));
        }
    }
}