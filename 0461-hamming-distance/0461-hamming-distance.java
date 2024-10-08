class Solution {
    public int hammingDistance(int x, int y) {
        int val=x^y;
        String s=Integer.toBinaryString(val);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
}