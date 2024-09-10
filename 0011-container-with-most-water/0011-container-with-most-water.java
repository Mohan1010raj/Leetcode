class Solution {
    public int maxArea(int[] height) {
        int max1=Integer.MIN_VALUE;
        int l=0;
        int r=height.length-1;
        while(l<r){
            max1=Math.max(max1,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max1;
    }
}