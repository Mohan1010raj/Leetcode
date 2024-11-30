class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        /*int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int a[]=new int[len];
        int l=0;
        for(int i=0;i<m;i++){
            a[l++]=nums1[i];
        }
        for(int i=0;i<n;i++){
            a[l++]=nums2[i];
        }
        if(a.length==1){
            return a[0];
        }
        Arrays.sort(a);
        
        int mid=(1+len)/2;
        if(len%2!=0){
            return a[mid-1];
        }
        else{
            return (a[mid-1]+a[mid])/2.0;
        }*/


        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) new_arr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (n%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[n/2];
    }
}