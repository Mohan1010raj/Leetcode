class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%3!=0){
            return false;
        }
        int target=sum/3;
        int curr=0;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            curr+=arr[i];
            if(curr==target){
                curr=0;
                count++;
                if(count==2) return true;
            }
        }
        return false;
    }
}