class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l=new ArrayList<>();
        int n=p.length();
        char c1[]=p.toCharArray();
        Arrays.sort(c1);
        p=new String(c1);
        for(int i=0;i<=s.length()-n;i++){
            String ss=s.substring(i,i+n);
            char c[]=ss.toCharArray();
            Arrays.sort(c);
            ss=new String(c);
            if(ss.equals(p)){
                l.add(i);
            }
        }
        return l;
    }
}



// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> list=new ArrayList<>();
		
// 		int len=p.length();
// 		for(int i=0;i<=s.length()-len;i++) {
// 			List<Character> l=new ArrayList<>();
// 			for(int j=i;j<i+len;j++) {
// 				l.add(s.charAt(j));
// 			}
// 			int count=0;
// 			for(int j=0;j<len;j++) {
// 				if(l.contains(p.charAt(j))) {
// 					count++;
// 					Character c=p.charAt(j);
// 					l.remove(c);
// 				}
// 			}
// 			if(count==len) {
// 				list.add(i);
// 			}
// 		}
// 		return list;
//     }
// }