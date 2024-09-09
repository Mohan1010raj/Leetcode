class Solution {
    public String reverseWords(String s) {
        String str[]=s.split("\\s+");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String t=str[i];
            str[i]=str[j];
            str[j]=t;
            i++;
            j--;
        }
        s=String.join(" ",str).trim();
        return s;
    }
}