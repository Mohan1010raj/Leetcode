class Solution {
    public int[] evenOddBit(int n) {
        int bi=binary(n);
        int res[]=new int[2];
		String s=String.valueOf(bi);
		if(s.length()%2==0) {
			even_size(s,res);
		}else {
			odd_size(s,res);
		}
        return res;
    }
    static int binary(int n) {
		if(n==0) {
			return 0;
		}
		return n%2+10*binary(n/2);
	}
	static int[] even_size(String s,int res[]) {
		int odd=0;
		int even=0;
       
		for(int i=s.length()-1;i>=0;i--) {
			if(i%2==0 && s.charAt(i)=='1') {
				odd++;
			}
			if(i%2==1 && s.charAt(i)=='1') {
				even++;
			}
		}
		res[0]=even;
        res[1]=odd;
        return res;
	}
	static int[] odd_size(String s,int res[]) {
		int odd=0;
		int even=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(i%2==1 && s.charAt(i)=='1') {
				odd++;
			}
			if(i%2==0 && s.charAt(i)=='1') {
				even++;
			}
		}
		res[0]=even;
        res[1]=odd;
        return res;
	}
}