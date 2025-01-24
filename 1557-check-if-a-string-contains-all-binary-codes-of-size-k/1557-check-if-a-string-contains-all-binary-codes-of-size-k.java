class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        int size=(int)Math.pow(2,k);
        Set<String> set=new HashSet<>();
        for(int i=0;i<=n-k;i++){
            String ss=s.substring(i,i+k);
            set.add(ss);
        }
        if(size==set.size()){
            return true;
        }else{
            return false;
        }
    }
}