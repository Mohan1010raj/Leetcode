class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char c[]=s.toCharArray();
        String vowels="aeiouAEIOU";
        while(i<j){
            while(i<j && vowels.indexOf(c[i])==-1){
                i++;
            }
            while(i<j && vowels.indexOf(c[j])==-1){
                j--;
            }
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
        return new String(c);
    }
}