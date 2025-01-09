class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int res[]=new int[n];
        if(k==0) return res;

        else if(k>0){
            int sum=0;
            for(int i=1;i<=k;i++){
                sum+=code[i];
            }
            res[0]=sum;
            for(int i=1;i<n;i++){
                sum+=code[(i+k)%n]-code[i];
                res[i]=sum;
            }
        }
        else if(k<0){
            int sum=0;
            for(int i=n-1;i>=n+k;i--){
                sum+=code[i];
            }
            res[0]=sum;
            for(int i=1;i<n;i++){
                sum+=code[i-1]-code[(n+k+(i-1))%n];
                res[i]=sum;
            }
        }
        return res;
    }
}