class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int max_len=1;
        String str=s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+max_len;j<=s.length();j++){
                if(j-i>max_len && isPalindrome(s.substring(i,j))){
                    max_len=j-i;
                    str=s.substring(i,j);
                }
            }
        }
        return str;
    }
    boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}