class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:amount){
            pq.add(i);
        }
        int cnt=0;
        while(!pq.isEmpty()){
            int val1=pq.poll();
            int val2=0;
            if(!pq.isEmpty()){
                val2=pq.poll();
            }
            if(val1!=0 || val2!=0) cnt++;
            if(val1>0) pq.add(val1-1);
            if(val2>0) pq.add(val2-1);
        }
        return cnt;
    }
}