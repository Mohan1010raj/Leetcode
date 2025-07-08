class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int vowels=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
        }
        max=Math.max(max,vowels);
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i-k);
            char ch=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels--;
            }
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            max=Math.max(max,vowels);
        }
        return max;
    }
}