class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for(int x:nums1){
            s1.add(x);
        }
        for(int x:nums2){
            if(s1.contains(x)){
                s2.add(x);
            }
        }
        int res[]=new int[s2.size()];
        int l=0;
        for(int x:s2){
            res[l++]=x;
        }
        return res;
    }
}