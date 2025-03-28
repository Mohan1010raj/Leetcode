class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());

        Map<Integer,Integer> sm=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry:l){
            sm.put(entry.getKey(),entry.getValue());
        }
        int sum=0;
        int max=l.get(0).getValue();
        for(Map.Entry<Integer,Integer> entry:sm.entrySet()){
            if(entry.getValue()==max){
                sum+=entry.getValue();
            }
        }
        return sum;
    }
}