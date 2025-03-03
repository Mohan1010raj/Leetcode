class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left=new ArrayList<>();
        List<Integer> pivot1=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i:nums){
            if(i<pivot) left.add(i);
            else if(i>pivot) right.add(i);
            else pivot1.add(i);
        }
        List<Integer> res=new ArrayList<>(); 
        for(int i:left){
            res.add(i);
        }
        for(int i:pivot1){
            res.add(i);
        } 
        for(int i:right){
            res.add(i);
        }        
        int ans[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}