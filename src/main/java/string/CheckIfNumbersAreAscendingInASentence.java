package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckIfNumbersAreAscendingInASentence {
	
	private Set<Character> set = new HashSet<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
	
    public boolean areNumbersAscending(String s) {
    	String[] words = s.split(" ");
    	int previous = 0;
    	for(int i = 0; i < words.length; i ++) {
    		if(isDigit(words[i])) {
    			int n = Integer.parseInt(words[i]);
    			if(n <= previous) return false;
    			previous = n;
    		}
    	}
        return true;
    }
    
    private boolean isDigit(String s) {
    	char[] c = s.toCharArray();
    	return set.contains(c[0]);
    }
    
}
