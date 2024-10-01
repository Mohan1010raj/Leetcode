class Solution {
    public boolean wordPattern(String pattern, String s) {
        String s1[]=s.split(" ");
        Map<Character,String> m=new HashMap<>();
        Map<String,Character> m1=new HashMap<>();
		if(pattern.length()!=s1.length) {
			return false;
		}
		for(int i=0;i<s1.length;i++) {
			char c=pattern.charAt(i);
			String word=s1[i];
			if(m.containsKey(c)) {
				if(!m.get(c).equals(word)) {
					return false;
				}
			}
            if(m1.containsKey(word) && !m1.get(word).equals(c)){
                return false;
            }
            
			m.put(c,word);
            m1.put(word,c);
		}
		return true;
    }
}