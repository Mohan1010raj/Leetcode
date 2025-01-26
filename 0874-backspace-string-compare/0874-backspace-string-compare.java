class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st1.isEmpty() && c=='#'){
                st1.pop();
            }
            else if(c!='#'){
                st1.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(!st2.isEmpty() && c=='#'){
                st2.pop();
            }
            else if(c!='#'){
                st2.push(c);
            }
        }
        return st1.equals(st2);
    }
}