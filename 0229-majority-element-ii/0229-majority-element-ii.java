class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        if(nums==null || nums.length==0){
            return l;
        }
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=nums.length/3;
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>max){
                l.add(entry.getKey());
            }
        }
        return l;
    }
}