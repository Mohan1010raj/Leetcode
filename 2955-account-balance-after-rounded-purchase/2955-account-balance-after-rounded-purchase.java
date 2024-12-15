class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int x=purchaseAmount%10;
        int y=10-x;
        if(x>=5){
            return Math.abs(100-(purchaseAmount+y));
        }
        else{
            return Math.abs(100-(purchaseAmount-x));
        }
    }
}