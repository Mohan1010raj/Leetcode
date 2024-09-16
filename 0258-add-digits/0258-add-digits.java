class Solution {
    public int addDigits(int num) {
        int s=0;
        while(num>0){
            int n=num%10;
            s+=n;
            num=num/10;
        }
        if(s>9){
            s=addDigits(s);
        }
        return s;
    }
}