class Solution {
    int count;
    public Solution(){
        this.count=0;
    }
    public int minimumOperations(int[] nums) {
        if(!nonZero(nums)) {
		    count++;
			int min=minimum(nums);
			for(int i=0;i<nums.length;i++) {
			    if(nums[i]!=0)
				    nums[i]=nums[i]-min;
			}
			for(int i=0;i<nums.length;i++) {
			    System.out.print(nums[i]+" ");
		    }
		    System.out.println();
			return minimumOperations(nums);
		}
		return count;
    }
    int minimum(int nums[]) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min && nums[i]>0) {
				min=nums[i];
			}
		}
		return min;
	}
	boolean nonZero(int nums[]) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				return false;
			}
		}
		return true;
	}
}