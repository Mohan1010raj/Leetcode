class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            String s=blocks.substring(i,i+k);
            int cnt=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='W'){
                    cnt++;
                }
            }
            min=Math.min(min,cnt);
        }
        return min;
    }
}