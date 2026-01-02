class Solution {
    public int numFriendRequests(int[] ages) {
        int n=ages.length;
        Arrays.sort(ages);
        int res=0;
        for(int x=n-1;x>0;x--){
            for(int y=x-1;y>=0;y--){
                if(ages[y]<=((double)0.5*ages[x]+7)) break;
                if(ages[y]>ages[x]) break;
                if(ages[y]>100 && ages[x]<100) break;
                if(ages[y]==ages[x]) res+=2;
                else res++;
            }
        }
        return res;
    }
}