class Solution {
    public int magicalString(int n) {
        StringBuilder s=new StringBuilder("122");
        int ind=2;
        char ch='1';
        while(s.length()<n){
            String ss=String.valueOf(ch).repeat(s.charAt(ind)-'0');
            s.append(ss);
            ind++;
            if(ch=='1') ch='2';
            else ch='1';
        }

        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') cnt++;
        }
        return cnt;
    }
}