class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> res=new HashSet<>();

        Set<Character> left=new HashSet<>();
        Map<Character,Integer> right=new HashMap<>();
        for(char c:s.toCharArray()){
            right.put(c,right.getOrDefault(c,0)+1);
        }

        for(char m:s.toCharArray()){
            right.put(m,right.getOrDefault(m,0)-1);

            for(char ch:left){
                if(right.get(ch)>0){
                    res.add(new String(new char[]{m,ch}));
                }
            }
            left.add(m);
        }
        return res.size();
    }
}