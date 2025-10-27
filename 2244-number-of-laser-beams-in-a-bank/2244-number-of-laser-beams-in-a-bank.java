class Solution {
    public int numberOfBeams(String[] bank) {
        int total=0;
        int tmp=0;
        for(String s:bank){
            int t=0;
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    t++;
                }
            }
            if(tmp!=0 && t!=0){
                total+=(tmp*t);
                tmp=t;
            }
            else if(tmp==0 && t!=0){
                tmp=t;
            }
        }
        return total;
    }
}