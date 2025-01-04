class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int x=nums[nums.length/2];
        int count=0;
        // for(int val:nums){
        //     if(val!=x && val<x){
        //         while(val!=x){
        //             val++;
        //             count++;
        //         }
        //     }
        //     if(val!=x && val>x){
        //         while(val!=x){
        //             val--;
        //             count++;
        //         }
        //     }
        // }
        for(int val:nums){
            if(val!=x){
                count+=Math.abs(val-x);
            }
        }
        return count;
    }
}