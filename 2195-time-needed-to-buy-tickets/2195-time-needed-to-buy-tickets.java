class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que=new LinkedList<>();
        for(int i:tickets)
        {
            que.add(i);
        }
        int f=tickets[k];
        int count=0;
        int s=k;
        while(f!=0)
        {
            int m=que.poll();
            if(m-1!=0)
            {
                que.add(m-1);
            }
            count+=1;
            s=s-1;
            if(s==-1)
            {
                s=que.size()-1;
                f=f-1;
            }
        }
        return count;
    }
}