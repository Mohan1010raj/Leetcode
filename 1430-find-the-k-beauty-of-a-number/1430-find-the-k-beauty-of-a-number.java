class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int c=0;
        for(int i=0;i<=s.length()-k;i++){
            String str=s.substring(i,i+k);
            int n=Integer.parseInt(str);
            if(n!=0 &&num%n==0){
                c++;
            }
        }
        return c;
    }
}