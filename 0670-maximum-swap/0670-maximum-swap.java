class Solution {
    public int maximumSwap(int num) {
        String s=String.valueOf(num);
        String c[]=s.split("");
        
        int arr1[]=new int[c.length];
        int arr2[]=new int[c.length];
        for(int i=0;i<c.length;i++){
            arr1[i]=Integer.valueOf(c[i]);
            arr2[i]=Integer.valueOf(c[i]);
        }
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" "+arr2[i]);
        }
        int max=Integer.MIN_VALUE;
        int index1=0;
        int index2=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[arr2.length-i-1]){
                max=arr2[arr2.length-i-1];
                index1=i;
                break;
            }
        }
        for(int i=index1;i<arr1.length;i++){
            if(arr1[i]==max){
                index2=i;
            }
        }
        
        int t=arr1[index1];
        arr1[index1]=arr1[index2];
        arr1[index2]=t;

        int res=0;
        for(int i=0;i<arr1.length;i++){
            res=res*10+arr1[i];
        }
        return res;
    }
}