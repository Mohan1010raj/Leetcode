class Solution {
    public int smallestRepunitDivByK(int k) {

        if(k%2==0 || k%5==0) return -1;
        int n=0;
        for(int i=1;i<=k;i++){
            n=(n*10+1)%k;
            if(n==0) return i;
        }
        return -1;



        // boolean arr[]=new boolean[k];
        // int n=0;
        // int ans=0;
        // while(true){
        //     ++ans;
        //     n=(n*10+1)%k;
        //     if(n==0) return ans;
        //     if(arr[n]) return -1;
        //     arr[n]=true;
        // }
    }
}