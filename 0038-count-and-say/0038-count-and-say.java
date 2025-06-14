class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=1;i<n;i++){
            res=count(res);
        }
        return res;
    }
    String count(String s){
        StringBuilder ss=new StringBuilder();
        int cnt=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
            }
            else{
                ss.append(cnt).append(s.charAt(i-1));
                cnt=1;
            }
        }
        ss.append(cnt).append(s.charAt(s.length()-1));
        return ss.toString();
    }
}