class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            res[nums[i]]+=1;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<res.length;i++){
            if(i>0 && res[i]==0){
                l.add(i);
            }
        }
        return l;
    }
}