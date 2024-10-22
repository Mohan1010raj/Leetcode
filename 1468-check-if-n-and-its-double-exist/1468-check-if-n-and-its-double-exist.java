class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(binary_search(2*arr[i],arr,i)) {
				return true;
			}	
		}
		return false;

    }
    
    static boolean binary_search(int x,int a[],int index) {
		int left=0;
		int right=a.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(a[mid]==x && mid!=index) {
				return true;
			}
			else if(a[mid]<x) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return false;
	}
}