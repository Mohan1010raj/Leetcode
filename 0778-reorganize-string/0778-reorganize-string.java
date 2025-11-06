class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->m.get(b)-m.get(a));
        pq.addAll(m.keySet());

        if(m.get(pq.peek())>(s.length()+1)/2) return "";

        StringBuilder res=new StringBuilder();

        char ch[]=new char[s.length()];
        int i=0;
        while(!pq.isEmpty()){
            char c=pq.poll();
            for(int j=0;j<m.get(c);j++){
                if(i>=s.length()) i=1;
                ch[i]=c;
                i+=2;
            }
        }
        return new String(ch);
    }
}