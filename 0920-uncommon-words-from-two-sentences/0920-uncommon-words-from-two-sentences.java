class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> m=new HashMap<>();
        String str1[]=s1.split(" ");
        String str2[]=s2.split(" ");
        for(String ss:str1){
            m.put(ss,m.getOrDefault(ss,0)+1);
        }
        for(String ss:str2){
            m.put(ss,m.getOrDefault(ss,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:m.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        String[] s=list.toArray(new String[list.size()]);
        return s;
    }
}