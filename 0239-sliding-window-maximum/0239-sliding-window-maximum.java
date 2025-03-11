class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0 || k==0){
            return new int[0];
        }
        int res[]=new int[nums.length-k+1];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        int l=0;
        for(int r=0;r<nums.length;r++){
            pq.add(new int[]{nums[r],r});
            
            if(r>=k-1){
                while(!pq.isEmpty() && pq.peek()[1]<l){
                    pq.poll();
                }
                res[l]=pq.peek()[0];
                l++;
            }
        }
        return res;
    }
}