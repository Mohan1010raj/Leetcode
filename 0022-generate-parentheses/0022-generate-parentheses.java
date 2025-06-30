class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs(res,0,0,"",n);
        return res;
    }
    void dfs(List<String> res,int l,int r,String s,int n){
        if(s.length()==2*n){
            res.add(s);
            return;
        }
        if(l<n){
            dfs(res,l+1,r,s+"(",n);
        }
        if(r<l){
            dfs(res,l,r+1,s+")",n);
        }
    }
}