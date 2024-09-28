class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int i=1;
		int count=0;
		while(i<n-1) {
			int l=i-1;
			int r=i+1;
			if(nums[i]==nums[r]){
			    i++;
			    continue;
			}
			while(l>0 && nums[i]==nums[l]) {
				l--;
			}
			
			if((nums[i]>nums[l] && nums[i]>nums[r]) || nums[i]<nums[l] && nums[i]<nums[r]) {
				count++;
			}
			i++;
		}
		return count;
    }
}