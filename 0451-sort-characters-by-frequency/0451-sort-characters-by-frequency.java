class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(m.entrySet());
        list.sort((entry1,entry2)->entry2.getValue()-entry1.getValue());

        String str="";
        for(Map.Entry<Character,Integer> entry:list){
            char key=entry.getKey();
            int val=entry.getValue();
            for(int i=0;i<val;i++){
                str+=key;
            }
        }
        return str;
    }
}