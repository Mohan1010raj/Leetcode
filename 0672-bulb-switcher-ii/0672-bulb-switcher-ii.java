class Solution {
    public int flipLights(int n, int p) {
        if(p==0){
            return 1;
        }
        else if(n==1){
            return 2;
        }
        else if(p==1){
            if(n==2){
                return 3;
            }
            else{
                return 4;
            }
        }
        else if(p==2){
            if(n==2){
                return 4;
            }
            // else if(n==3){
            //     return 7;
            // }
            else{
                return 7;
            }
        }
        else{
            if(n==2){
                return 4;
            }
            else{
                return 8;
            }
        }
    }
}