class Solution {
    public void setZeroes(int[][] mat) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    l1.add(i);
                    l2.add(j);
                }
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(l1.contains(i) || l2.contains(j)){
                    mat[i][j]=0;
                }
            }
        }
    }
}