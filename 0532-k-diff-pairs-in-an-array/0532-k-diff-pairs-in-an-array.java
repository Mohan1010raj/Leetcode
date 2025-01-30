class Solution {
    
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Map<Integer,Integer> m=new HashMap<>();
        int l=0;
        int r=l+1;
        int cnt=0;
        while(l<nums.length-1){
            int diff=Math.abs(nums[l]-nums[r]);
            if(diff<k){
                r++;
            }
            else if(diff>k){
                l++;
                r=l+1;
            }
            else{
                m.put(nums[l],nums[r]);
                System.out.println(nums[l]+" "+nums[r]);
                l++;
                r=l+1;
                cnt++;
            }

            if(r==nums.length){
                l++;
                r=l+1;
            }
        }
        
        return m.size();
    }
}