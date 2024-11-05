class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
		for(String num:tokens) {
			if(isOperator(num)) {
				int val1=st.pop();
				int val2=st.pop();
				switch(num) {
				case "+":
					st.push(val2+val1);
					break;
				case "-":
					st.push(val2-val1);
					break;
				case "*":
					st.push(val2*val1);
					break;
				case "/":
					st.push(val2/val1);
					break;
				}
			}
			else {
				st.push(Integer.parseInt(num));
			}
		}
		return st.pop();
	}
	static boolean isOperator(String num) {
		return num.equals("+") || num.equals("-") || num.equals("*") || num.equals("/");
    }
}