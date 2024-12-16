class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        String binary = Integer.toBinaryString(n);
        StringBuilder res=new StringBuilder();
        for(char c:binary.toCharArray()){
            if(c=='1'){
                res.append('0');
            }
            else{
                res.append('1');
            }
        }
        return Integer.parseInt(res.toString(),2);
    }
}