class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length-1;
        int cnt=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                cnt++;
                l++;
                r--;
            }
            else if(people[r]<=limit) {
                cnt++;
                r--;
            }
            else if(people[l]<=limit) {
                cnt++;
                l++;
            }
            
        }
        return cnt;
    }
}