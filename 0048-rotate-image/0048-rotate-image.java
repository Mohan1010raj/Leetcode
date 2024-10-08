class Solution {
    public void rotate(int[][] matrix) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=matrix[i].length-1;j>=0;j--){
                l.add(matrix[j][i]);
            }
            list.add(l);
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=list.get(i).get(j);
            }
        }
    }
}