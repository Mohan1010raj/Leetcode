class Solution {
    public String[] findRelativeRanks(int[] score) {
        String res[]=new String[score.length];
        int arr[]=new int[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=score[i];
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<score.length;j++){
                if(arr[i]==score[j]){
                    if(arr.length-i==1){
                        res[j]="Gold Medal";
                    }
                    else if(arr.length-i==2){
                        res[j]="Silver Medal";
                    }
                    else if(arr.length-i==3){
                        res[j]="Bronze Medal";
                    }
                    else{
                        res[j]=String.valueOf(arr.length-i);
                    }
                }
            }
        }
        return res;
    }
}