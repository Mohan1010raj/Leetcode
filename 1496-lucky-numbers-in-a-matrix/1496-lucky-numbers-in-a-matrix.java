class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        List<Integer> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                min=Math.min(min,mat[i][j]);
            }
            l.add(min);
        }
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
                max=Math.max(max,mat[j][i]);
            }
            if(l.contains(max)){
                list.add(max);
            }
        }
        return list;
    }
}