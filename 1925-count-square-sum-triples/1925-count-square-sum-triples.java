class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int sum=(i*i)+(j*j);
                double val=Math.sqrt(sum);
                
                if(val<=n && val%1==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}