class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder res=new StringBuilder();
        StringBuilder add=new StringBuilder();
        add.append("maa");
        String vowel="aeiouAEIOU";
        for(String s:sentence.split(" ")){
            if(vowel.indexOf(s.charAt(0))!=-1){
                res.append(s).append(add).append(" ");
            }
            else{
                res.append(s.substring(1)).append(s.charAt(0)).append(add).append(" ");
            }
            add.append("a");
        }
        return res.toString().trim();
    }
}