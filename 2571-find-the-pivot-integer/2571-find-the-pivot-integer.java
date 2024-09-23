class Solution {
    public int pivotInteger(int n) {
        int l=1;
        int r=n;
        int pivot=-1;
        while(l<=r){
            int l_sum=sum(1,l);
            int r_sum=sum(l,r);
            if(l_sum==r_sum){
                pivot=l;
                break;
            }
            else{
                l++;
            }
        }
        return pivot;
    }
    public static int sum(int val1,int val2){
        int sum=0;
        for(int i=val1;i<=val2;i++){
            sum+=i;
        }
        return sum;
    }
}