class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        int five=0;
        int ten=0;
        int twenty=0;
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five<1) return false;
                ten++;
                five--;
            }
            else if(bills[i]==20){
                if(ten==0 && five<3) return false;
                else if(ten>=1 && five<1) return false;
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(ten<1 && five>=3){
                    five-=3;
                }
                
            }
        }
        return true;
    }
}