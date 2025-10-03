class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> res=new ArrayList<>();
        Arrays.sort(folder);
        int i=0,j=1;
        while(i<folder.length){
            res.add(folder[i]);
            String s1=folder[i];
            while(j<folder.length){
                int n=s1.length();
                if(n>folder[j].length()){
                    break;
                }
                if((s1.equals(folder[j])) ||
                (folder[j].substring(0,n).equals(s1) && folder[j].charAt(n)  =='/')){
                    j++;
                }
                else{
                    break;
                }
            }
            i=j;
            j=i+1;
        }
        return res;
    }
}