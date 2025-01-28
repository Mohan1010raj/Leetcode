import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger arr[]=new BigInteger[nums.length];
        for(int i=0;i<nums.length;i++){
            BigInteger val=new BigInteger(nums[i]);
            arr[i]=val;
        }
        Arrays.sort(arr);
        return String.valueOf(arr[arr.length-k]);
    }
}