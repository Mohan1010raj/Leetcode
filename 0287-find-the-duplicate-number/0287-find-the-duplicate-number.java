// class Solution {
//     public int findDuplicate(int[] nums) {
//         int res[]=new int[nums.length+1];
//         int dup=0;
//         for(int i=0;i<nums.length;i++){
//             res[nums[i]]+=1;
//         }
//         for(int i=0;i<res.length;i++){
//             if(res[i]>1){
//                 dup=i;
//             }
//         }
//         return dup;
//     }
// }
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return i;
            }
        }
        return -1;
    }
}