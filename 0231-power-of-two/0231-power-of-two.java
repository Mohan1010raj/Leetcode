class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=n;i++){
            int a=(int)Math.pow(2,i);
            if(a==n){
                return true;
            }
            if(a>n/2){
                break;
            }
        }
        return false;
    }
}