class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
		while(numBottles>=numExchange) {
			numBottles-=numExchange;
			res+=1;
			numExchange+=1;
			numBottles+=1;
		}
		return res;
    }
}