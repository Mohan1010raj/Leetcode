class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j<min){
                        min=i+j;
                        l.clear();
                        l.add(list1[i]);
                    }
                    else if(i+j==min){
                        l.add(list1[i]);
                    }
                }
            }
        }
        String res[]=new String[l.size()];
        
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}