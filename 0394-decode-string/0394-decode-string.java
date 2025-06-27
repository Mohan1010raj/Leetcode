class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
		for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=']'){
                st.push(String.valueOf(c));
            }
            else{
                String str="";
                while(!st.isEmpty() && !st.peek().equals("[")){
                    str=st.pop()+str;
                }
                st.pop();
                String num="";
                while(!st.isEmpty() && isInteger(st.peek())){
                    num=st.pop()+num;
                }
                st.push(str.repeat(Integer.parseInt(num)));
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
		return res;
    }
    boolean isInteger(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}