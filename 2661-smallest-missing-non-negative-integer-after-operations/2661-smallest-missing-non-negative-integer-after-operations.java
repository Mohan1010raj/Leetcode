class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int rem[]=new int[value];
        for(int num:nums){
            int r=((num%value)+value)%value;
            rem[r]++;
        }
        int res=0;
        while(rem[res%value]>0){
            rem[res%value]--;
            res++;  
        }
        return res;
    }
}