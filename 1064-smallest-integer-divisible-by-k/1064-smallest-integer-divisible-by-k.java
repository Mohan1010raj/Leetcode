class Solution {
    public int smallestRepunitDivByK(int k) {
        boolean arr[]=new boolean[k];
        int n=0;
        int ans=0;
        while(true){
            ++ans;
            n=(n*10+1)%k;
            if(n==0) return ans;
            if(arr[n]) return -1;
            arr[n]=true;
        }
    }
}