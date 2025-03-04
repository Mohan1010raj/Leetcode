class Solution {
    public boolean checkPowersOfThree(int n) {
        return dfs(n,0);
    }
    boolean dfs(int n,int i){
        if(n==0) return true;
        if(Math.pow(3,i)>n) return false;
        return dfs(n-(int)Math.pow(3,i),i+1) || dfs(n,i+1);
    }
}