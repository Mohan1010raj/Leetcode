class Solution {
    public int maxDistance(String ss, int k) {
        int n=0,s=0,e=0,w=0;
        int max=0;
        for(int i=0;i<ss.length();i++){
            char c=ss.charAt(i);
            if(c=='N'){
                n++;
            }
            else if(c=='S'){
                s++;
            }
            else if(c=='E'){
                e++;
            }
            else if(c=='W'){
                w++;
            }
            int x=Math.abs(n-s);
            int y=Math.abs(e-w);
            int md=x+y;
            int dis=md+Math.min(2*k,i+1-md);
            max=Math.max(max,dis);
        }
        return max;
    }
}