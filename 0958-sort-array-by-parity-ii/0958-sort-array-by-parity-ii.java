class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i:nums){
            if(i%2==0){
                l1.add(i);
            }
            else{
                l2.add(i);
            }
        }
        int len1=0;
        int len2=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=l1.get(len1++);
            }    
            else{
                res[i]=l2.get(len2++);
            }
        }
        return res;








        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i%2==0 && nums[j]%2==0 && nums[j]>=0){
        //             res[i]=nums[j];
        //             nums[j]=-1;
        //             break;
        //         }
        //         if(i%2==1 && nums[j]%2==1 && nums[j]>=0){
        //             res[i]=nums[j];
        //             nums[j]=-1;
        //             break;
        //         }
        //     }
        // }
        // return res;
    }
}