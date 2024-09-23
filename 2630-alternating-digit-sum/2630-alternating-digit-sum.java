class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
		int sum=0;
		int sign=1;
		for(int i=0;i<s.length();i++){
		    int temp=Character.getNumericValue(s.charAt(i));
		    sum+=temp*sign;
		    sign=-sign;
		}
		return sum;
    }
}