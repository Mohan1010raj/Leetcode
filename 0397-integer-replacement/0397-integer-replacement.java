class Solution {
    public int integerReplacement(int n) {
        if(Integer.MAX_VALUE==n) n--;
        int cnt=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else if(n==3 || (n-1)%4==0){
                n--;
            }
            else{
                n++;
            }
            cnt++;
        }
        return cnt;
    }
}