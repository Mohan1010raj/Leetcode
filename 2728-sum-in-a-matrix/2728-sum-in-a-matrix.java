class Solution {
    public int matrixSum(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        for(int[] i:nums){
            Arrays.sort(i);
        }
        int res=0;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(max,nums[j][i]);
            }
            res+=max;
        }
        return res;
    }
}