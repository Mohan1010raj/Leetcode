class Solution {
    class Pair{
        int key;
        int value;
        Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.key==b.key){
                return a.value-b.value;
            }
            return a.key-b.key;
        });
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            pq.add(new Pair(diff,arr[i]));
        }

        
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<k;i++){
            
            int key=pq.peek().key;
            int val=pq.peek().value;
            pq.poll();
            System.out.print(key+" "+val+" ");
            l.add(val);
        }
        Collections.sort(l);
        return l;
    }
}