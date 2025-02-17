class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        return new HashSet<>(m.values()).size()<=1;
    }
}