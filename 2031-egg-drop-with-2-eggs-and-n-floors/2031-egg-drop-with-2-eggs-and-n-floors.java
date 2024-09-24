class Solution {
    public int twoEggDrop(int n) {
       int c=0;
		int index=1;
		while(n>0) {
			n=n-index;
			index++;
			c+=1;
		}
		return c; 
    }
}