class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char c[]=s.toCharArray();
        String vowels="aeiouAEIOU";
        while(i<j){
            if(vowels.indexOf(c[i])!=-1 && vowels.indexOf(c[j])!=-1){
                char t=c[i];
                c[i]=c[j];
                c[j]=t;
                i++;
                j--;
            }
            else if(vowels.indexOf(c[i])==-1){
                i++;
            }
            else{
                j--;
            }
        }
        return new String(c);
    }
}