class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                StringBuilder str1=new StringBuilder(s.substring(i,j));
                String str=str1.toString();
                String str2=str1.reverse().toString();
                if(str.equals(str2)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}