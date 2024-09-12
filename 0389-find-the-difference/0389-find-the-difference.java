class Solution {
    public char findTheDifference(String s, String t) {
        int[] charCount = new int[26];


        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }


        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charCount[c - 'a']--;


            if (charCount[c - 'a'] < 0) {
                return c;
            }
        }

        return ' ';
    }
}