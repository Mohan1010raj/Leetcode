class Solution {
    public int numSub(String s) {
        long ans=0;
        long one=0;
        int mod=1000000007;
        for(char c:s.toCharArray()){
            if(c=='1'){
                one++;
            }
            else{
                ans+=((one*(one+1))/2)%mod;
                one=0;
            }
        }
        if(s.charAt(s.length()-1)=='1'){
            ans+=((one*(one+1))/2)%mod;
        }
        return (int)ans;
    }
}