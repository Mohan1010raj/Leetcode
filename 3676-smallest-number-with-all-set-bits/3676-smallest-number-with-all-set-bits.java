class Solution {
    public int smallestNumber(int n) {
        while(true){
            String binary=Integer.toBinaryString(n);
            boolean f=true;
            for(char ch:binary.toCharArray()){
                if(ch!='1'){
                    f=false;
                    break;
                }
            }
            if(f) return n;
            n++;
        }
    }
}