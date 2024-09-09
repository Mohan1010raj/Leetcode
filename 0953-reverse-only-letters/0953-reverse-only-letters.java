class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char c[]=s.toCharArray();
        while(i<j){
            while(i<j && !Character.isLetter(c[i])){
                i++;
            }
            while(i<j && !Character.isLetter(c[j])){
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