class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int len=0;
        int cnt=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0) cnt++;
            while(cnt>k){
                if(nums[l]==0){
                    cnt--;
                }
                l++;
            }
            len=Math.max(len,r-l+1);
        }
        return len;
        
        
        
        
        // int i=0;
        // int j=i;
        // int temp=k;
        // int len=0;
        // while(i<nums.length){
        //     if(j<nums.length && nums[j]==1){
        //         j++;
        //     }
        //     else if(j<nums.length && nums[j]==0){
        //         j++;
        //         if(k>0) k--;
        //     }
        //     if(k==0 && j<nums.length && nums[j]==0){
        //         len=Math.max(len,(j-i));
        //         i++;
        //         j=i;
        //         k=temp;
        //     }
        //     if(j==nums.length){
        //         len=Math.max(len,(j-i));
        //         i++;
        //         j=i;
        //         k=temp;
        //     }
            
        // }
        // if(k==0) return len-1;
        // return len;
    }
}