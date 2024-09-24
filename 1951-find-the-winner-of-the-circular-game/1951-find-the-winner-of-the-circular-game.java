class Solution {
    public int findTheWinner(int n, int k) {
        // int res[]=new int[n];
        // for(int i=0;i<n;i++){
        //     res[i]=i+1;
        // }
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