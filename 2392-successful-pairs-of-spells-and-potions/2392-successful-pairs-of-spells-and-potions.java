class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        Arrays.sort(potions);
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=binarySearch(spells[i],potions,success);
        }
        return res;
    }
    int binarySearch(int spell,int potions[],long success){
        int m=potions.length;
        int l=0,r=m-1;
        int ind=m;
        while(l<=r){
            int mid=(l+r)/2;
            if((long)spell*potions[mid]>=success){
                ind=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return m-ind;
    }
}