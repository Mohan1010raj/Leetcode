class Solution {
    public int maxTurbulenceSize(int[] arr) {
        // int i=0;
        // int j=i;
        // boolean flag=true;
        // List<Integer> l=new ArrayList<>();
        // int max=0;
        // while(i<arr.length-1){
        //     if(arr[i]>arr[i+1]){
        //         if(flag==true && arr[j]>arr[j+1]){
        //             l.add(arr[j]);
        //             j++;
        //             flag=false;
        //         }
        //         else if(flag==false && arr[j]<arr[j+1]){
        //             l.add(arr[j]);
        //             j++;
        //             flag=true;
        //         }
        //         else{
        //             i++;
        //             j=i;
        //             max=Math.max(max,l.size());
        //             l.clear();
        //             flag=true;
        //         }
        //         if(j==arr.length-1){
        //             i++;
        //             j=i;
        //             max=Math.max(max,l.size());
        //             l.clear();
        //             flag=true;
        //         }
        //     }
        //     else{
        //         if(flag==true && arr[j]<arr[j+1]){
        //             l.add(arr[j]);
        //             j++;
        //             flag=false;
        //         }
        //         else if(flag==false && arr[j]>arr[j+1]){
        //             l.add(arr[j]);
        //             j++;
        //             flag=true;
        //         }
        //         else{
        //             i++;
        //             j=i;
        //             max=Math.max(max,l.size());
        //             l.clear();
        //             flag=true;
        //         }
        //         if(j==arr.length-1){
        //             i++;
        //             j=i;
        //             max=Math.max(max,l.size());
        //             l.clear();
        //             flag=true;
        //         }
        //     }
        // }
        // return max+1;






        int up=1;
        int down=1;
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                down=up+1;
                up=1;

            }
            else if(arr[i]<arr[i-1]){
                up=down+1;
                down=1;
            }
            else{
                up=1;
                down=1;
            }
            res=Math.max(res,Math.max(up,down));
        }
        return res;
    }
}