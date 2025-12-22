class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=1;i<=s.length();i++){
            for(String word:wordDict){
                int st=i-word.length();
                if(st>=0 && dp[st] && s.substring(st,i).equals(word)){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}