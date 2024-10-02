class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<ransomNote.length();i++) {
			arr1[ransomNote.charAt(i)-'a']+=1;
		}
		for(int i=0;i<magazine.length();i++) {
			arr2[magazine.charAt(i)-'a']+=1;
		}
		for(int i=0;i<ransomNote.length();i++) {
			if(arr1[ransomNote.charAt(i)-'a']>arr2[ransomNote.charAt(i)-'a']){
				return false;
			}
		}
		return true;
    }
}