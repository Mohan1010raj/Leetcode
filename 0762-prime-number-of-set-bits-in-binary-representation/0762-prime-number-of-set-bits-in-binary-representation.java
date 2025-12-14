class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            String b=Integer.toBinaryString(i).replace("0","");
            int len=b.length();
            if(isPrime(len)){
                cnt++;
            }
        }
        return cnt;
    }
    boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}