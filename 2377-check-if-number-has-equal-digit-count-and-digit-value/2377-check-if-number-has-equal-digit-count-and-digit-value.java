class Solution {
    public boolean digitCount(String num) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:num.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i=0;i<num.length();i++){
            char key=(char)('0'+i);
            int x=num.charAt(i)-'0';
            int y=m.getOrDefault(key,0);
            if(x!=y){
                return false;
            }
        }
        return true;
    }
}