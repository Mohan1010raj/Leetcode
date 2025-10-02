class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            st.push(ch);
            if(st.size()>=part.length()){
                String ss="";
                for(int i=0;i<part.length();i++){
                    ss=st.pop()+ss;
                }
                if(!ss.equals(part)){
                    for(char c:ss.toCharArray()){
                        st.push(c);
                    }
                }
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
    }
}