class Solution {
    public int minStartValue(int[] nums) {
        int n=1;
        boolean f=true;
        while(f){
            int t=n;
            for(int num:nums){
                t+=num;
                if(t<1){
                    f=false;
                }
            }
            if(!f){
                f=true;
                n++;
            }
            else{
                return n;
            }
        } 
        return 0;
    }
}