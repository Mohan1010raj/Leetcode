class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(String s1:str){
            Stack<Character> st1=new Stack<>();
            for(char c:s1.toCharArray()){
                st1.push(c);
            }
            while(!st1.isEmpty()){
                res.append(st1.pop());
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}