class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=0;
        int empty=numBottles;
        while(empty>=numExchange){
            sum+=numBottles;
            int rem=empty%numExchange;
            numBottles=(empty/numExchange);
            empty=numBottles+rem;
            System.out.println(sum+" "+rem+" "+numBottles+" "+empty);
        }
        return sum+numBottles;
    }
}