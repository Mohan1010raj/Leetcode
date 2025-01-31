class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry:l){
            int key=entry.getKey();
            int val=entry.getValue();

            if(entry.getValue()<=k){
                m.remove(key);
                k-=val;
            }
            else{
                break;
            }
        }
        return m.size();
    }
}