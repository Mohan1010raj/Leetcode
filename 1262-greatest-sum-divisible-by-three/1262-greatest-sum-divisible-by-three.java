class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%3==0){
            return sum;
        }
        else if(sum%3==1){
            int min=Integer.MAX_VALUE;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int num:nums){
                if(num%3==1 && num<min){
                    min=num;
                }
                else if(num%3==2){
                    pq.add(num);
                }
            }
            if(pq.size()>=2){
                min=Math.min(min,(pq.poll()+pq.poll()));
            }
            return sum-min;
        }
        else if(sum%3==2){
            int min=Integer.MAX_VALUE;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int num:nums){
                if(num%3==2 && num<min){
                    min=num;
                }
                else if(num%3==1){
                    pq.add(num);
                }
            }
            if(pq.size()>=2){
                min=Math.min(min,(pq.poll()+pq.poll()));
            }
            return sum-min;
        }
        return 0;
    }
}