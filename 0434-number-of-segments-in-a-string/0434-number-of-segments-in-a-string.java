class Solution {
    public int countSegments(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }
        
        String str[]=s.split("\\s+");
        return str.length;
    }
}