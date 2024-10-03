class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l=new ArrayList<>();
        int i=0;
		while(i<nums.length) {
			int j=i;
			while(j<nums.length-1 && nums[j]+1==nums[j+1]){
			    j++;
			}
			if(i==j) {
			    l.add(nums[j]+"");
			}
			else{
				l.add(nums[i]+"->"+nums[j]);
			}
			i=j+1;
		}
        return l;
    }
}