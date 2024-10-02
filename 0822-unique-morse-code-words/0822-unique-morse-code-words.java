class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> temp=new HashSet<>();
		for(int i=0;i<words.length;i++) {
			temp.add(trans(words[i],arr));
		}
        return temp.size();
    }
    public String trans(String s,String arr[]) {
		String str="";
		for(int i=0;i<s.length();i++) {
			int n=s.charAt(i)-'a';
			str+=arr[n];
		}
		return str;
	}
}