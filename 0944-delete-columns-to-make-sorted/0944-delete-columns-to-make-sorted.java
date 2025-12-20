class Solution {
    public int minDeletionSize(String[] str) {
        int cnt=0;
        for(int i=0;i<str[0].length();i++){
            char ch=str[0].charAt(i);
            for(int j=1;j<str.length;j++){
                if(ch<=str[j].charAt(i)){
                    ch=str[j].charAt(i);
                }
                else{
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}