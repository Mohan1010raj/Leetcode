class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            int c=0;
            for(char a:s.toCharArray()){
                if(a=='1'){
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}