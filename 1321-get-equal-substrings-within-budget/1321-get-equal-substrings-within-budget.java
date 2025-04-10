class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            while(j<s.length() && maxCost>=0){
                maxCost=maxCost-(Math.abs(s.charAt(j)-t.charAt(j)));
                if(maxCost>=0){
                    ans=Math.max(ans,j-i+1);
                }
                j++;
            }
            
            while(maxCost<0){
                maxCost=maxCost+(Math.abs(s.charAt(i)-t.charAt(i)));
                i++;
            }
        }
        return ans;
    }
}