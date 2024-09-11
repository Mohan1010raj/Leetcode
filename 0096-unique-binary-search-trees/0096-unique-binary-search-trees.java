class Solution {
    public int numTrees(int n) {
        int a[]=new int[n+1];
        a[0]=a[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                a[i]+=a[j-1]*a[i-j];
            }
        }
        return a[n];
    }
}