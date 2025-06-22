class Solution {
    public int[][] spiralMatrixIII(int row, int col, int i, int j) {
        int val = 1;
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(i, j));

        while (list.size()<(row*col)){
            if(val%2==1){
                for(int l=1;l<=val;l++) {
                    j++;
                    if(i>=0 && i<row && j>=0 && j<col) {
                        list.add(Arrays.asList(i,j));
                    }
                }

                for(int l=1;l<=val;l++){
                    i++;
                    if(i>=0 && i<row && j>=0 && j<col) {
                        list.add(Arrays.asList(i,j));
                    }
                }
            }else{
                for(int l=1;l<=val;l++) {
                    j--;
                    if(i>=0 && i<row && j>=0 && j<col) {
                        list.add(Arrays.asList(i, j));
                    }
                }

                for(int l=1;l<=val;l++) {
                    i--;
                    if(i>=0 && i<row && j>=0 && j<col) {
                        list.add(Arrays.asList(i, j));
                    }
                }
            }
            val++;
        }
        
        int arr[][]=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
            arr[k][0]=list.get(k).get(0);
            arr[k][1]=list.get(k).get(1);
        }
        

        return arr;

    }
}