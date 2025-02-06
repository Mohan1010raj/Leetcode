class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pro=nums[i]*nums[j];
                m.put(pro,m.getOrDefault(pro,0)+1);
            }
        }
        int res=0;
        for(int i:m.values()){
            if(i>1){
                res+=i*(i-1)/2;
            }
        }
        return res*8;
    }
}