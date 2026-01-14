class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        int cnt[]=new int[n+1];
        for(int p[]:trust){
            cnt[p[0]]--;
            cnt[p[1]]++;
        }
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]==n-1) return i;
        }
        return -1;
    }
}