class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[]=new int[2];
        int n=grid.length;
        int m=grid[0].length;
        int arr[]=new int[m*n];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[l++]=grid[i][j];
            }
        }
        int nums[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            nums[arr[i]]+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>1){
                res[0]=i;
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==0){
                res[1]=i;
            }
        }
        return res;
    }
}