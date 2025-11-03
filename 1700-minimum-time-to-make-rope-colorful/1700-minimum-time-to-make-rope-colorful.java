class Solution {
    public int minCost(String colors, int[] arr) {
        int ans=0;
        int i=0;
        for(i=0;i<arr.length-1;i++){
            int sum=0;
            int max=0;
            boolean f=true;
            while(i<arr.length-1 && colors.charAt(i)==colors.charAt(i+1)){
                f=false;
                sum+=arr[i];
                max=Math.max(max,arr[i]);
                i++;
            }
            sum+=arr[i];
            max=Math.max(max,arr[i]);
            if(!f){
                ans=ans+(sum-max);
            }
        }
        return ans;
    }
}