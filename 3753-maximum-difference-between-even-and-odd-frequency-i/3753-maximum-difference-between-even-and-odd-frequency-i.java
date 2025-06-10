class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Character,Integer> entry:l){
            int val=entry.getValue();
            System.out.println(entry.getKey()+" "+val);
        }
        
        int odd=0;
        int even=0;
        for(Map.Entry<Character,Integer> entry:l){
            int val=entry.getValue();
            if(val%2==1){
                odd=val;
            }
        }
        for(Map.Entry<Character,Integer> entry:l){
            int val=entry.getValue();
            if(val%2==0){
                even=val;
                break;
            }
        }
        return odd-even;
    }
}