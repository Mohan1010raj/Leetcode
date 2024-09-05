class Solution {
    public int[] findErrorNums(int[] nums) {
        int res[]=new int[2];
        int a[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            a[nums[i]]+=1;
        }
        for(int i=0;i<nums.length+1;i++){
            if(a[i]==2){
                res[0]=i;
            }
            if(a[i]==0 && i>0){
                res[1]=i;
            }
        }
        return res;
    }
}