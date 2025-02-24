class Solution {
    public String makeGood(String s) {
            String ss[]=s.split("");
            Stack<String> st=new Stack<>();
            for(int i=0;i<ss.length;i++){
                if(st.size()>=1){
                    String s1=st.pop();
                    
                    if(s1.equalsIgnoreCase(ss[i])){
                        if((s1.equals(s1.toLowerCase()) && 
                        ss[i].equals(ss[i].toUpperCase())) ||
                        (s1.equals(s1.toUpperCase()) && 
                        ss[i].equals(ss[i].toLowerCase()))){
                            continue;
                        }
                    }
                    st.push(s1);
                }
                st.push(ss[i]);
            }

            StringBuilder str=new StringBuilder();
            while(!st.isEmpty()){
                str.append(st.pop());
            }
            str.reverse();
            return str.toString();
    }
}