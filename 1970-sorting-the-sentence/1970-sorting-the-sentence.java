class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
		StringBuilder res=new StringBuilder();
		int n=str.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				String word=str[j];
				int len=word.length();
				if(Character.getNumericValue(word.charAt(len-1))==i+1) {
					res.append(word.substring(0,len-1)).append(" ");
				}
			}
		}
		return res.toString().trim();
    }
}