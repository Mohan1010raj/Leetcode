class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        Stack<String> st=new Stack<>();
        for(String word:words){
            char c[]=word.toCharArray();
            Arrays.sort(c);
            String s=new String(c);
            if(!st.isEmpty() && st.peek().equals(s)){
                continue;
            }
            else{
                st.push(s);
                res.add(word);
            }
        }
        return res;
    }
}