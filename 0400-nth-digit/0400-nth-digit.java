class Solution {
    public int findNthDigit(int n) {
        int digits=1;
        long cnt=9;
        int st=1;

        while(n>digits*cnt){
            n-=digits*cnt;
            digits++;
            cnt*=10;
            st*=10;
            //System.out.println(n+" "+digits+" "+cnt+" "+st);
        }

        st+=(n-1)/digits;
        //System.out.println("st: "+st);
        String s=Integer.toString(st);
        return Character.getNumericValue(s.charAt((n-1)%digits));
    }
}