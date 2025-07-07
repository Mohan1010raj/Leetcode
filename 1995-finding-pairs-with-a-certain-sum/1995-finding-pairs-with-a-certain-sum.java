class FindSumPairs {
    int arr1[];
    int arr2[];
    Map<Integer,Integer> m=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1=nums1;
        arr2=nums2;
        for(int x:arr2) m.put(x,m.getOrDefault(x,0)+1);
    }
    
    public void add(int index, int val) {
        m.put(arr2[index],m.get(arr2[index])-1);
        arr2[index]+=val;
        m.put(arr2[index],m.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int cnt=0;
        for(int x:arr1) cnt+=m.getOrDefault(tot-x,0);
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */