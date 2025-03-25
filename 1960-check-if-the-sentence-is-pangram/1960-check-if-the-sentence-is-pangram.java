class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> set=new HashSet<>();
        
        for(char c:s.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                set.add(c);
                if(set.size()==26) return true;
            }
        }
        return set.size()==26;
    }
}