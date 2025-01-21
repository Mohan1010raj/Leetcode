class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((entry1,entry2)->entry2.getValue()-entry1.getValue());

        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:l){
            list.add(entry.getKey());
        }

        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}