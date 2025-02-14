class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length==0) return new int[0][0];

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> l=new ArrayList<>();

        int[] curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(curr[1]>=arr[i][0]){
                curr[1]=Math.max(curr[1],arr[i][1]);
            }
            else{
                l.add(curr);
                curr=arr[i];
            }
        }
        l.add(curr);

        return l.toArray(new int[l.size()][]);
    }
}