class Solution {
    public int findMaxK(int[] nums) {
        int res=-1;
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if((nums[i]>0 && nums[i]==Math.abs(nums[j]) || nums[i]<0 && Math.abs(nums[i])==nums[j] ) && nums[i]!=nums[j]) {
					if(Math.abs(nums[i])>res) {
						res=Math.abs(nums[i]);
					}
				}
			}
		}
		return res;
    }
}