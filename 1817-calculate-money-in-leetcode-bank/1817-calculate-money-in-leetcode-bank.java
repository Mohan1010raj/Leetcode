class Solution {
    public int totalMoney(int n) {
        int total=0;
        int cnt=0;
        int t=cnt;
        for(int i=1;i<=n;i++){
            if(i%7==1){
                cnt++;
                t=cnt;
            }
            total+=t;
            t++;
        }
        return total;
    }
}