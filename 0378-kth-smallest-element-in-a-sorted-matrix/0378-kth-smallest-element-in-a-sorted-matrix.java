class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        TreeMap<Integer,Integer> m=new TreeMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
                m.put(val,m.getOrDefault(val,0)+1);
            }
        }
        int cnt=0;
        int res=0;
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            cnt+=entry.getValue();
            System.out.print(cnt+" ");
            if(cnt>=k){
                res=entry.getKey();
                break;
            }
        }
        return res;
    }
}