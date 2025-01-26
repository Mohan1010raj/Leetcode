class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> l=new ArrayList<>();
        char cc[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(cc[i]==c){
                l.add(i);
            }
        }
        int res[]=new int[cc.length];
        for(int i=0;i<cc.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<l.size();j++){
                int diff=Math.abs(i-l.get(j));
                min=Math.min(diff,min);
            }
            res[i]=min;
        }
        return res;
    }
}