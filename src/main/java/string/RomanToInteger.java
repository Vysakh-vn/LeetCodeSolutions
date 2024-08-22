package string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	public static final Map<Character, Integer> romanMap = new HashMap<>();
	
	static {
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
	}
	
	/**
	 * Functions to find the integer equivalent of Roman number.
	 * 
	 * @param s Input Roman number
	 * @return Integer value of input Roman number
	 */
	public int romanToInt(String s) {
		int total = 0;
		int prevValue = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			int value = romanMap.get(c);
			if(value < prevValue) {
				total -= value;
			} else {
				total += value;
			}
			prevValue = value;
		}
		return total;
	}

}
