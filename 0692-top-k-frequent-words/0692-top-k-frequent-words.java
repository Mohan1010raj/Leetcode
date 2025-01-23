class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> m=new HashMap<>();
        for(String i:words){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<String,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((entry1,entry2)->{
            if(!entry1.getValue().equals(entry2.getValue())){
                return entry2.getValue()-entry1.getValue();
            }
            else{
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });



        List<String> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(l.get(i).getKey());
        }
        return res;
    }
}