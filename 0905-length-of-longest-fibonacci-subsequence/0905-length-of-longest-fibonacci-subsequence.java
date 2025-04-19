class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int i:arr){
            set.add(i);
        }
        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;++j){
                int prev=arr[j];
                int curr=arr[i]+arr[j];
                int len=2;

                while(set.contains(curr)){
                    int tmp=curr;
                    curr+=prev;
                    prev=tmp;
                    max=Math.max(max,++len);
                }
            }
        }
        return max;
        
    }
}