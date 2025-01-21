class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q1.add(students[i]);
            q2.add(sandwiches[i]);
        }
        while(!q2.isEmpty()){
            int val=q2.poll();
            int size=q1.size();
            boolean flag=false;
            for(int i=0;i<size;i++){
                int x=q1.poll();
                if(x==val){
                    flag=true;
                    break;
                    
                }
                else{
                    q1.add(x);
                }
            }
            if(flag==true){
                continue;
            }
            else{
                break;
            }
        }
        return q1.size();
    }
}