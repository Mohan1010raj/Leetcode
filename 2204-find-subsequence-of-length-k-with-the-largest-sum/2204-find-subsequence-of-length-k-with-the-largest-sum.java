class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int res[]=new int[k];
        int l=0;
        List<Integer> list=new ArrayList<>();
        for(int i=arr.length-k;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                res[l++]=nums[i];
                list.remove(Integer.valueOf(nums[i]));
            }
        }
        return res;
    }
}