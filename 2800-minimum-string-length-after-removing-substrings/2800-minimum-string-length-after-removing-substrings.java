class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
		int i=0;
		while(i<s.length()) {
			char c=s.charAt(i);
			if(st.isEmpty()) {
				st.push(c);
			}
			else if(c=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(c=='D' && st.peek()=='C'){
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