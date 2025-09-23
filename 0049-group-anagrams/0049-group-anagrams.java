class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> m=new HashMap<>();

        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String ss=new String(c);

            if(!m.containsKey(ss)){
                m.put(ss,new ArrayList<>());
            }
            m.get(ss).add(s);
        }
        return new ArrayList<>(m.values());









        // List<List<String>> res=new ArrayList<>();
        // boolean vis[]=new boolean[strs.length];

        // for(int i=0;i<strs.length;i++){
        //     List<String> l=new ArrayList<>();
        //     if(!vis[i]){
        //         Map<Character,Integer> m1=new HashMap<>();
        //         String s1=strs[i];
        //         for(char c:s1.toCharArray()){
        //             m1.put(c,m1.getOrDefault(c,0)+1);
        //         }
        //         for(int j=i;j<strs.length;j++){
        //             if(!vis[j]){
        //                 Map<Character,Integer> m2=new HashMap<>();
        //                 String s2=strs[j];
        //                 for(char c:s2.toCharArray()){
        //                     m2.put(c,m2.getOrDefault(c,0)+1);
        //                 }
        //                 if(m1.equals(m2)){
        //                     l.add(strs[j]);
        //                     vis[j]=true;
        //                 }
        //             }
        //         }
        //         vis[i]=true;
        //     }
        //     if(l.size()>0){
        //         res.add(new ArrayList<>(l));
        //     }
        // }
        // return res;
    }
}