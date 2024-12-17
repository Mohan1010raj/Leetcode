class Solution {
    public String reformat(String s) {
        StringBuilder l=new StringBuilder();
        StringBuilder d=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                l.append(s.charAt(i));
            }
            else{
                d.append(s.charAt(i));
            }
        }
        if(Math.abs(l.length()-d.length())>1){
            return "";
        }
        if(l.length()>d.length()){
            for(int i=0;i<d.length();i++){
                ans.append(l.charAt(i));
                ans.append(d.charAt(i));
            }
            ans.append(l.charAt(l.length()-1));
        }
        if(d.length()>l.length()){
            for(int i=0;i<l.length();i++){
                ans.append(d.charAt(i));
                ans.append(l.charAt(i));
            }
            ans.append(d.charAt(d.length()-1));
        }
        if(l.length()==d.length()){
            for(int i=0;i<l.length();i++){
                ans.append(l.charAt(i));
                ans.append(d.charAt(i));
            }
        }
        return ans.toString();
    }
}