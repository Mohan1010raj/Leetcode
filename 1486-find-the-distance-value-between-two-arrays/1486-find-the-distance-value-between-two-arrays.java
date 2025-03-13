class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        outer:for(int i:arr1){
            for(int j:arr2){
                if(Math.abs(i-j)<=d){
                    continue outer;
                }
            }
            cnt++;
        }
        return cnt;
    }
}