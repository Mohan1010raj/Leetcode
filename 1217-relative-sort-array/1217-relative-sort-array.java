class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:arr1){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(m.entrySet());
        list.sort((a,b)->a.getKey()-b.getKey());
        Map<Integer,Integer> sm=new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> entry:list){
            sm.put(entry.getKey(),entry.getValue());
        }
        int l=0;
        for(int num:arr2){
            if(sm.containsKey(num)){
                int val=sm.get(num);
                for(int i=0;i<val;i++){
                    arr1[l++]=num;
                }
            }
            sm.remove(num);
        }
        for(Map.Entry<Integer,Integer> entry:sm.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            for(int i=0;i<val;i++){
                arr1[l++]=key;
            }
        }
        return arr1;
    }
}