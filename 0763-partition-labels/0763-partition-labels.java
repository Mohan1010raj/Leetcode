class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        int ind=s.lastIndexOf(s.charAt(0));
        int l=0;
        int r=1;
        while(l<s.length()){
            if(r>=ind && (ind-l+1)!=0){
                res.add(ind-l+1);
                l=ind+1;
            }
            else if(s.lastIndexOf(s.charAt(r))<=ind){
                r++;
            }
            else{
                ind=s.lastIndexOf(s.charAt(r));
                r++;
            }
        }
        return res;
    }
}