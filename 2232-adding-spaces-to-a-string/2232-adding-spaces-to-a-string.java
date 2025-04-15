class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        int l=0;
        int r=0;
        while(l<s.length() && r<spaces.length){
            if(l==spaces[r]){
                res.append(" ").append(s.charAt(l));
                l++;
                r++;
            }
            else{
                res.append(s.charAt(l));
                l++;
            }
        }
        while(l<s.length()){
            res.append(s.charAt(l));
            l++;
        }
        return res.toString();
    }
}