class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
		int res[]=new int[nums.length];
		int j=nums.length-1;
		for(int i=1;i<nums.length;i=i+2) {
			res[i]=nums[j--];
		}
		for(int i=0;i<nums.length;i=i+2) {
			res[i]=nums[j--];
		}
		for(int i=0;i<res.length;i++){
            nums[i]=res[i];
        }
    }
}