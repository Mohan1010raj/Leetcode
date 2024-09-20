class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int res[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int l=0;
            int r=image[i].length-1;
            while(l<=r){
                int t=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=t;

                l++;
                r--;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0){
                    res[i][j]=1;
                }else{
                    res[i][j]=0;
                }
            }
        }
        return res;
    }
}