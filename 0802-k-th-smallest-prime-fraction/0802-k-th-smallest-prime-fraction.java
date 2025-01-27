import java.util.AbstractMap;
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Map.Entry<Double,Map.Entry<Integer,Integer>>> pq=
        new PriorityQueue<>((a,b)->Double.compare(a.getKey(),b.getKey()));

        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double val=(double)arr[i]/arr[j];
                pq.add(new AbstractMap.SimpleEntry<>(val,
                new AbstractMap.SimpleEntry<>(arr[i],arr[j])));
            }
        }

        // while(!pq.isEmpty()){
        //     Map.Entry<Double,Map.Entry<Integer,Integer>> ele=pq.poll();
        //     System.out.println(ele.getKey()+" "+ele.getValue().getKey()+" "+
        //     ele.getValue().getValue());

        // }
        int res[]=new int[2];
        for(int i=0;i<k;i++){
            Map.Entry<Double,Map.Entry<Integer,Integer>> ele=pq.poll();
            res[0]=ele.getValue().getKey();
            res[1]=ele.getValue().getValue();
        }
        return res;
    }
}