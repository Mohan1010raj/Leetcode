class Solution {
    int mod=1000000007;
    public int countPermutations(int[] complexity) {
        int n=complexity.length;

        for(int i=1;i<n;i++){
            if(complexity[i]<=complexity[0]) return 0;
        }

        return (int)fact(n-1)%mod;
    }
    public long fact(int n){
        long f=1;
        for(int i=1;i<=n;i++){
            f=(f*i)%mod;
        }
        return f;
    }
}