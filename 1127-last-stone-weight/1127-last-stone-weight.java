class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            int ele=stones[i];
            l.add(ele);
        }
        int ans=0;
        int len=l.size();
		while(len>1) {
			int max=Integer.MIN_VALUE;
			int s_max=Integer.MIN_VALUE;
			for(int i=0;i<l.size();i++) {
				if(l.get(i)>max) {
					s_max=max;
					max=l.get(i);
				}
				else if(l.get(i)>s_max) {
					s_max=l.get(i);
				}
			}
			if(max-s_max>0)
				l.add(max-s_max);
			l.remove(Integer.valueOf(max));
			l.remove(Integer.valueOf(s_max));
			len=l.size();
		}
		if(l.size()==1) {
			ans=l.get(0);
		}
		
		return ans;

    }
}