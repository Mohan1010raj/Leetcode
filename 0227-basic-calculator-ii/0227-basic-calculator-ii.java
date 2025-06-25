class Solution {
    public int calculate(String s) {
        String post=infixToPostfix(s);
        return evaluate(post);
    }
    String infixToPostfix(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch==' ') continue;
            if(Character.isDigit(ch)){
                str.append(ch);
            }
            else{
                str.append(' ');
                while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    str.append(st.pop()).append(' ');
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            str.append(' ').append(st.pop());
        }
        return str.toString();
    }
    int precedence(char ch){
        if(ch=='^') return 3;
        else if(ch=='*' || ch=='/') return 2;
        else if(ch=='+' || ch=='-') return 1;
        return 0;
    }
    int evaluate(String s){
        Stack<Integer> st=new Stack<>();
        for(String ss:s.split(" ")){
            if(ss.matches("\\d+")){
                st.push(Integer.parseInt(ss));
            }
            else{
                int val2=st.pop();
                int val1=st.pop();
                switch(ss){
                    case "+":
                        st.push(val1+val2);
                        break;
                    case "-":
                        st.push(val1-val2);
                        break;
                    case "*":
                        st.push(val1*val2);
                        break;
                    case "/":
                        st.push(val1/val2);
                        break;
                }
            }
        }
        return st.pop();
    }
}