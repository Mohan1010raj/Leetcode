class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!m.containsKey(s.charAt(i)))
                m.put(s.charAt(i),t.charAt(i));
            
            else{
                if(t.charAt(i)!=m.get(s.charAt(i))){
                    return false;
                }
            }
        }
        Map<Character,Character> rm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!rm.containsKey(t.charAt(i)))
                rm.put(t.charAt(i),s.charAt(i));
            
            else{
                if(s.charAt(i)!=rm.get(t.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}