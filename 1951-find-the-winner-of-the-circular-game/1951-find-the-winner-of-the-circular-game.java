class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l=new ArrayList<>();
		for(int i=0;i<n;i++){
		    l.add(i+1);
		}
		int index=0;
		while(l.size()>1){
		    index=(index+k-1)%l.size();
		    l.remove(index);
		}
		return l.get(0);
    }
}