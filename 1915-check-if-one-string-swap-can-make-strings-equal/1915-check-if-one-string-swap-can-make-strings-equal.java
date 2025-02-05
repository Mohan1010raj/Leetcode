class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        int l=0;
        int r=c2.length-1;
        while(l<=r){
            if(c1[l]==c2[l]){
                l++;
            }
            else if(c1[r]==c2[r]){
                r--;
            }
            else{
                char t=c2[l];
                c2[l]=c2[r];
                c2[r]=t;
                s2=new String(c2);
                System.out.println(s2);
                if(!s1.equals(s2)){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return true;
    }
}