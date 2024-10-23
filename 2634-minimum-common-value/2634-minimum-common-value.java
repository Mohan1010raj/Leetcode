class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
		for(int i=0;i<nums1.length;i++) {
			if(binary(nums1[i],nums2)) {
				return nums1[i];
			}
		}
		return -1;
    }
    boolean binary(int x,int nums2[]) {
		int l=0;
		int r=nums2.length-1;
		while(l<=r) {
			int m=(l+r)/2;
			if(nums2[m]==x) {
				return true;
			}
			else if(nums2[m]<x) {
				l=m+1;
			}
			else {
				r=m-1;
			}
		}
		return false;
	}
}