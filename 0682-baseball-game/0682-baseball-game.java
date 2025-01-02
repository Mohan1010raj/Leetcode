class Solution {
    public int calPoints(String[] operations) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int size=l.size();
                l.add(l.get(size-1)+l.get(size-2));
            }
            else if(operations[i].equals("D")){
                l.add(2*l.get(l.size()-1));
            }
            else if(operations[i].equals("C")){
                l.removeLast();
            }
            else{
                l.add(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
    
}