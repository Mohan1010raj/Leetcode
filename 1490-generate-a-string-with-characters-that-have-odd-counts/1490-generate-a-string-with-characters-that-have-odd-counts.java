class Solution {
    public String generateTheString(int n) {
        if(n==1){
            return "a";
        }
        StringBuilder res=new StringBuilder();
        if(n%2==0){
            for(int i=0;i<n-1;i++){
                res.append('a');
            }
            res.append('b');
        }
        else{
            res.append('a');
            for(int i=1;i<n-1;i++){
                res.append('b');
            }
            res.append('c');
        }
        return res.toString();
    }
}