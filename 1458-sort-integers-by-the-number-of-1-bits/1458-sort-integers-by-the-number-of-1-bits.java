class Solution {
    class Pair{
        int key,val;
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] sortByBits(int[] arr) {
        int res[]=new int[arr.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.val==b.val){
                return a.key-b.key;
            }
            return a.val-b.val;
        });
        for(int i:arr){
            int bc=Integer.bitCount(i);
            pq.add(new Pair(i,bc));
        }
        for(int i=0;i<arr.length;i++){
            res[i]=pq.poll().key;
        }
        return res;
    }
}