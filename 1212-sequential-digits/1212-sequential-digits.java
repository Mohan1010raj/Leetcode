class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<=9;i++) {
			String s="";
			for(int j=i;j<=9;j++) {
				s+=String.valueOf(j);
				int val=Integer.parseInt(s);
				if(val>=low && val<=high) {
					list.add(val);
				
				}
			}
		}
		Collections.sort(list);
		return list;
    }
}