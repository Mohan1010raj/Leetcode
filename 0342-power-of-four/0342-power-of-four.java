class Solution {
    public boolean isPowerOfFour(int n) {
        
        for(int i=0;i<=n;i++){
            int a=(int)Math.pow(4,i);
            if(a==n){
                return true;
            }
            if(a>n/4){
                break;
            }
        }
        return false;
    }
}