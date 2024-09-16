class Solution {
    public boolean isPowerOfThree(int n) {
        // if(n<=0){
        //     return false;
        // }
        // int i=1;
        // while(i<=n){
        //     if(i==n){
        //         return true;
        //     }
        //     if(i>n/3){
        //         break;
        //     }
        //     i*=3;
        // }
        // return fals
        
        for(int i=0;i<=n;i++){
            int a=(int)Math.pow(3,i);
            if(a==n){
                return true;
            }
            if(a>n/3){
                break;
            }
        }
        return false;
    }
}