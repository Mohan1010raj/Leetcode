class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] res=new int[nums.length-k+1];
        int[] freq=new int[101]; 

        for (int i=0;i<k;i++){
            freq[nums[i]+50]++;
        }

        for (int i=k;i<=nums.length;i++) {
            int count=0;
            for (int j=0;j<50;j++) { 
                count+=freq[j];
                if(count>=x) {
                    res[i-k]=j-50;
                    break;
                }
            }

            if (i==nums.length) break;

            freq[nums[i-k]+50]--;
            freq[nums[i]+50]++;
        }

        return res;
    }
}