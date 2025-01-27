class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;


        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // for(int i:nums){
        //     pq.add(i);
        // }

        // for(int i=0;i<nums.length;i++){
        //     nums[i]=pq.poll();
        // }
        // return nums;
    }
}