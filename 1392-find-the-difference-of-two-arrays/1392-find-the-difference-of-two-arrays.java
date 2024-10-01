class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> l=new ArrayList<>();
		Set<Integer> s1=new HashSet<>();
		Set<Integer> s2=new HashSet<>();
		Set<Integer> s3=new HashSet<>();
		Set<Integer> s4=new HashSet<>();
		for(int i:nums1) {
			s1.add(i);
		}
		for(int i:nums2) {
			s2.add(i);
		}
		for(int i:s1) {
			if(!s2.contains(i)) {
				s3.add(i);
			}
		}
		for(int i:s2) {
			if(!s1.contains(i)) {
				s4.add(i);
			}
		}
		l.add(new ArrayList(s3));
		l.add(new ArrayList(s4));
        return l;
    }
}