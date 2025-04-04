class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n<=2) return 1;
        int a=0;
        int b=1;
        int c=1;
        int fib=0;
        for(int i=0;i<=n-3;i++){
            fib=a+b+c;
            a=b;
            b=c;
            c=fib;
        }
        return fib;
    }
}