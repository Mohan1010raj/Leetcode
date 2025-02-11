class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st=new Stack<>();
        Set<Character> set=new HashSet<>();
        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),i);    
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!set.contains(c)){
                while(!st.isEmpty() && c<st.peek() && i<m.get(st.peek())){
                    set.remove(st.pop());
                }
                set.add(c);
                st.push(c);
            }
        }

        StringBuilder res=new StringBuilder();
        for(char c:st){
            res.append(c);
        }
        return res.toString();
    }
}