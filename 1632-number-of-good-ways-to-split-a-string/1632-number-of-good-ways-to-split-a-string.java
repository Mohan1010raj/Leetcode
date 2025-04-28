class Solution {
    public int numSplits(String s) {
        int cnt=0;
        Map<Character,Integer> l=new HashMap<>();
        Map<Character,Integer> r=new HashMap<>();
        for(char c:s.toCharArray()){
            r.put(c,r.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            l.put(c,l.getOrDefault(c,0)+1);
            r.put(c,r.getOrDefault(c,0)-1);

            if(r.get(c)<=0){
                r.remove(c);
            }
            if(l.size()==r.size()){
                cnt++;
            }
        }
        return cnt;
    }
}