class Solution {
    public double minimumAverage(int[] nums) {
        List<Double> average=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n/2;i++){
            int min=nums[i];
            int max=nums[n-1-i];
            double avg=(min+max)/2.0;
            average.add(avg);
        }
        double minval=Double.MAX_VALUE;
        for(double avg:average){
            minval=Math.min(minval,avg);
        }
        return minval;
    }
}