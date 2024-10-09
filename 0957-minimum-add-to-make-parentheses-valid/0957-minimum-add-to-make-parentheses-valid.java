class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='('){
                st.push(c);
            }
            else if(!st.isEmpty() && c==')' && st.peek()=='('){
                st.pop();
            }
            else{
                st.push(c);
            }
            i++;
        }
        return st.size();
    }
}