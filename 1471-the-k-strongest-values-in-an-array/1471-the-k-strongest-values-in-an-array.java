class Solution {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        int mid=arr[(arr.length-1)/2];
        int ind=0;
        int res[]=new int[k];
        while(ind<k){
            if(mid-arr[i]>arr[j]-mid){
                res[ind++]=arr[i++];
            }
            else{
                res[ind++]=arr[j--];
            }
        }
        return res;
    }
}