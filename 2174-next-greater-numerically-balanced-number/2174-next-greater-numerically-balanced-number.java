class Solution {
    public int nextBeautifulNumber(int n) {
        while(true){
            if(isBeautiful(++n)) return n;
        }
    }
    boolean isBeautiful(int n){
        int f[]=new int[10];

        while(n>0){
            int d=n%10;
            if(d==0) return false;
            f[d]++;
            n/=10;
        }
        for(int i=0;i<10;i++){
            if(f[i]!=0 && f[i]!=i) return false;
        }
        return true;
    }
}