class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
        
        
        
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // for(int i:nums){
        //     pq.add(i);
        // }
        // int res=0;
        // for(int i=0;i<k;i++){
        //     res=pq.poll();
        // }
        // return res;
    }
}