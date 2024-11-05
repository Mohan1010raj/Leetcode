class Solution {
    public String reverseParentheses(String s) {
        StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(char ch:s.toCharArray()) {
			if(ch==')') {
				while(stack.peek()!='(') {
					result.append(stack.pop().toString());
				}
				stack.pop();
				for(char ele: result.toString().toCharArray()) {
					stack.push(ele);
				}
				result.delete(0, result.length());
			}
			else{
				stack.push(ch);
			}
		}

		for(char ck:stack) {
			result.append(ck);
		}
		return result.toString();
    }
}