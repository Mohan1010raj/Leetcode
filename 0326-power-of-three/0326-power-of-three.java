class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int i=1;
        while(i<=n){
            if(i==n){
                return true;
            }
            if(i>n/3){
                break;
            }
            i*=3;
        }
        return false;
    }
}