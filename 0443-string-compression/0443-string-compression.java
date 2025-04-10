class Solution {
    public int compress(char[] chars) {
        int l=0;
        int r=l;
        String s="";
        while(l<chars.length && r<chars.length){
            if(chars[l]==chars[r]){
                r++;
            }
            else{
                s+=chars[l];
                if(r-l>1){
                    s+=Integer.toString(r-l);
                }
                l=r;
                r=l;
            }
        }
        s+=chars[l];
        if(r-l>1){
            s+=Integer.toString(r-l);
        }
        for(int i=0;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}