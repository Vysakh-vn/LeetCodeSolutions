package stack;

import java.util.Stack;

public class ValidParantheses {
	
	/**
	 * Validates if a given string of parentheses is well-formed.
	 * 
	 * A string is considered valid if:
	 * - Every opening bracket ('(', '{', '[') has a corresponding closing bracket (')', '}', ']').
	 * - Brackets are closed in the correct order.
	 * 
	 * @param s the input string containing only '(', ')', '{', '}', '[' and ']'.
	 * @return true if the input string is valid, otherwise false.
	 * 
	 * Time Complexity: O(n), where n is the length of the input string.
	 * - Each character is processed once, and stack operations (push/pop) are O(1).
	 * 
	 * Space Complexity: O(n), in the worst case, where all opening brackets are stored in the stack.
	 */
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
