class Solution {
    public int hIndex(int[] citations) {
        int s=0;
        int e=citations.length-1;
        int h=0;
        while(s<=e){
            int m=(s+e)/2;
            if(citations[m]>=citations.length-m){
                h=citations.length-m;
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return h;
    }
}