class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int max=0;
        for(int val:potions){
            max=Math.max(max,val);
        }
        long suffix[]=new long[max+1];
        for(int i=0;i<potions.length;i++){
            suffix[potions[i]]++;
        }
        for(int i=max-1;i>=0;i--){
            suffix[i]+=suffix[i+1];
        }
        for(int i=0;i<spells.length;i++){
            long div=success/spells[i];
            long rem=success%spells[i];
            if(rem>0){
                div++;
            }
            if(div>max){
                spells[i]=0;
            }
            else{
                spells[i]=(int)suffix[(int)div];
            }
        }
        return spells;
    }
}