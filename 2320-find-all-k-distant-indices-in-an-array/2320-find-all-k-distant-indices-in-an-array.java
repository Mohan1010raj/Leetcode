class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                l.add(i);
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int ind:l){
                if(Math.abs(i-ind)<=k){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}