class Solution {
    class Pair{
        String first;
        int second;
        Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String ss:wordList){
            set.add(ss);
        }
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            String word=q.peek().first;
            int cnt=q.peek().second;
            q.remove();

            if(word.equals(endWord)) return cnt;

            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char replace[]=word.toCharArray();
                    replace[i]=ch;
                    String replacedString=new String(replace);
                    if(set.contains(replacedString)){
                        set.remove(replacedString);
                        q.add(new Pair(replacedString,cnt+1));
                    }
                }
            }
        }
        return 0;
    }
}