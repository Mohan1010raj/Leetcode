class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase();
        String s[]=paragraph.split("[^a-zA-Z]+");
        Map<String,Integer> m=new HashMap<>();
        for(String ss:s){
            m.put(ss,m.getOrDefault(ss,0)+1);
        }
        List<Map.Entry<String,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->b.getValue()-a.getValue());

        for(Map.Entry<String,Integer> entry:l){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Set<String> set=new HashSet<>();
        for(String i:banned){
            set.add(i);
        }
        String res="";
        for(Map.Entry<String,Integer> entry:l){
            String str=entry.getKey();
            if(banned.length==0){
                res+=str;
                break;
            }
            else{
                if(!set.contains(str)){
                    res+=str;
                    break;
                }
            }
        }
        return res;
    }
}