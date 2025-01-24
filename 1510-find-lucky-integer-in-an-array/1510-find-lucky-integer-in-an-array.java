class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int res=-1;
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(key==val){
                res=key;
            }
        }
        return res;
    }
}