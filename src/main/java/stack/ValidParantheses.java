package stack;

import java.util.Stack;

public class ValidParantheses {
	
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if( c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
            	if(stack.isEmpty()) return false;
                    char r = stack.pop();
                    if(r == '(' && c != ')') return false;
                    if(r == '{' && c != '}') return false;
                    if(r == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

}
